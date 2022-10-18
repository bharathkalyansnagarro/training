package models;

import enums.CarType;
import enums.InsuranceType;

public class CarDetails {

    private int carCost;
    private String carModel;
    private CarType carType;
    private InsuranceType insuranceType;

    public CarDetails(int carCost, String carModel, CarType carType, InsuranceType insuranceType) {
        this.carCost = carCost;
        this.carModel = carModel;
        this.carType = carType;
        this.insuranceType = insuranceType;
    }

    public int getCarCost() {
        return carCost;
    }

    public void setCarCost(int carCost) {
        this.carCost = carCost;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public InsuranceType getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(InsuranceType insuranceType) {
        this.insuranceType = insuranceType;
    }
}
