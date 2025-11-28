package org.example.entity;

public class Car {
    public String carModel;
    public CarType carType;

    public Car(String carModel, CarType carType) {
        this.carModel = carModel;
        this.carType = carType;
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
}
