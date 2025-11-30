package org.example.entity;

public class Bike extends RentableItem {
    private BikeType type;

    public Bike(String model, BikeType type) {
        super(model);
        this.type = type;
    }
}
