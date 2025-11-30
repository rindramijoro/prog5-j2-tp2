package org.example.entity;

public abstract class RentableItem {
    private String model;

    public RentableItem(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
