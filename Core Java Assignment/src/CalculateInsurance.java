import constants.Constants;
import enums.CarType;
import enums.InsuranceType;
import models.CarDetails;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateInsurance {

    public void calculateInsurance() {
        Scanner scanner = new Scanner(System.in);
        boolean enterLoop = true;
        while (enterLoop) {

            try {
                CarDetails carDetails = getUserInput();
                double calculatedInsurance = calculateInsurance(carDetails);
                System.out.println("Insurance to be paid :: " + calculatedInsurance);
                System.out.println("Do you want to enter details of any other car (y/n):");
                char reply = scanner.next().charAt(0);
                if (reply != 'y') enterLoop = false;
            } catch (InputMismatchException exception) {
                System.out.println("Entered Wrong Input!");
            }
        }
    }

    private CarDetails getUserInput() throws InputMismatchException {

        Scanner scanner = new Scanner(System.in);

        String carModel;
        int carTypeSelection, insuranceTypeSelection;
        double carCost = -1;
        CarType carType = CarType.HATCH_BACK;
        InsuranceType insuranceType = InsuranceType.BASIC;


        System.out.println("Enter Car Model : ");
        carModel = scanner.next();


        //CAR COST
        while (carCost < 0) {
            System.out.println("Enter Car Cost Price : ");
            carCost = scanner.nextDouble();
        }

        //CAR TYPE
        System.out.println("Please Enter Car Type!");
        System.out.println("Available Car Types : \n1.HatchBack\n2.Sedan\n3.SUV");
        carTypeSelection = scanner.nextInt();
        while (carTypeSelection < 0 || carTypeSelection > 3) {
            System.out.println("Please choose from above options!");
            carTypeSelection = scanner.nextInt();
        }
        if (carTypeSelection == 2) carType = CarType.SEDAN;
        else if (carTypeSelection == 3) carType = CarType.SUV;


        //INSURANCE TYPE
        System.out.println("Please Enter Type of Insurance ");
        System.out.println("Available Insurance Types : \n1.Basic \n2.Premium");
        insuranceTypeSelection = scanner.nextInt();
        while (insuranceTypeSelection < 0 || insuranceTypeSelection > 2) {
            System.out.println("Please choose from above options!");
            insuranceTypeSelection = scanner.nextInt();
        }

        if (insuranceTypeSelection == 2) insuranceType = InsuranceType.PREMIUM;


        return new CarDetails(carCost, carModel, carType, insuranceType);
    }

    private double calculateInsurance(CarDetails carDetails) {
        double insuranceCost = 0L;
        double carCost = carDetails.getCarCost();
        CarType carType = carDetails.getCarType();

        switch (carType) {
            case HATCH_BACK:
                insuranceCost = carCost * Constants.HATCH_BACK_INSURANCE_PREMIUM;
                break;
            case SEDAN:
                insuranceCost = carCost * Constants.SEDAN_INSURANCE_PREMIUM;
                break;
            case SUV:
                insuranceCost = carCost * Constants.SUV_INSURANCE_PREMIUM;
                break;
        }

        if (carDetails.getInsuranceType() == InsuranceType.PREMIUM) insuranceCost += (insuranceCost * 0.2);

        return insuranceCost;
    }

}
