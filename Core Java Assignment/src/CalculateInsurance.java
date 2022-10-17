import java.util.Scanner;

public class CalculateInsurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Car Model : ");
            String carModel = scanner.next();

            System.out.println("Enter Car Cost Price : ");
            long carCost = scanner.nextLong();

            System.out.println("Please Enter Car Type!");
            System.out.println("Available Car Types : \n1.HatchBack\n2.Sedan\n3.SUV");
            int carType = scanner.nextInt();


            System.out.println("Please Enter Type of Insurance ");
            System.out.println("Available Insurance Types : \n1.Basic \n2.Premium");
            int insuranceType = scanner.nextInt();

            long calculatedInsurance = calculateInsurance(carCost, carType, insuranceType);
            System.out.println("Insurance to be paid :: " + calculatedInsurance);

            System.out.println("Do you want to enter details of any other car (y/n):");
            char reply = scanner.next().charAt(0);
            if (reply == 'n') break;
        }
    }

    private static long calculateInsurance(long carCost, int carType, int insuranceType) {
        long insuranceCost = 0L;

        switch (carType) {
            case 1:
                insuranceCost = (long) (carCost * 0.05);
                break;
            case 2:
                insuranceCost = (long) (carCost * 0.08);
                break;
            case 3:
                insuranceCost = (long) (carCost * 0.1);
                break;
        }

        if (insuranceType == 2) insuranceCost += (insuranceCost * 0.2);

        return insuranceCost;
    }
}
