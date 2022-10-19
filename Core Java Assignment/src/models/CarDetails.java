package models;

import enums.CarType;
import enums.InsuranceType;

public class CarDetails {

    private final double carCost;
    private final String carModel;
    private final CarType carType;
    private InsuranceType insuranceType;

    public CarDetails(double carCost, String carModel, CarType carType, InsuranceType insuranceType) {
        this.carCost = carCost;
        this.carModel = carModel;
        this.carType = carType;
        this.insuranceType = insuranceType;
    }

    public double getCarCost() {
        return carCost;
    }

    public String getCarModel() {
        return carModel;
    }


    public CarType getCarType() {
        return carType;
    }


    public InsuranceType getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(InsuranceType insuranceType) {
        this.insuranceType = insuranceType;
    }

    @Override
    public String toString() {
        return "CarDetails{" +
                "carCost=" + carCost +
                ", carModel='" + carModel + '\'' +
                ", carType=" + carType +
                ", insuranceType=" + insuranceType +
                '}';
    }
}
