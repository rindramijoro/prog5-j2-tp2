package org.example.entity;

public class Renter {
    private String name;
    private RenterType type;
    private boolean driverLicense;
    private boolean id;

    public Renter(String name, RenterType type, boolean driverLicense, boolean id) {
        this.name = name;
        this.type = type;
        this.driverLicense = driverLicense;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RenterType getType() {
        return type;
    }

    public void setType(RenterType type) {
        this.type = type;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public boolean isId() {
        return id;
    }

    public void setId(boolean id) {
        this.id = id;
    }
}
