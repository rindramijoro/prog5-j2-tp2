package org.example.entity;

public class Renter {
    public String name;
    public RenterType type;

    public Renter(String name, RenterType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public RenterType getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(RenterType type) {
        this.type = type;
    }
}
