package org.example.entity;

public class House extends RentableItem {
    private HouseType type;

    /*In the house, model it's marked as model but work as address*/
    public House(String model, HouseType type) {
        super(model);
        this.type = type;
    }
}
