package org.example.entity;

public class House extends RentableItem {
    private HouseType type;


    public House(String model, HouseType type) {
        super(model);
        this.type = type;
    }
}
