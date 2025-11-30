package org.example.entity;

public class Car extends RentableItem{
    private CarType carType;

    public Car(String model, CarType carType) {
        super(model);
        this.carType = carType;
    }

    public CarType getCarType() {
        return carType;
    }
}
