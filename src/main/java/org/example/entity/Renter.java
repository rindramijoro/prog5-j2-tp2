package org.example.entity;

public class Renter {
    private String name;
    private RenterType type;
    private boolean driverLicense;
    private boolean id;
    private boolean bankAccount;

    public Renter(String name, RenterType type, boolean driverLicense, boolean id, boolean bankAccount) {
        this.name = name;
        this.type = type;
        this.driverLicense = driverLicense;
        this.id = id;
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(RenterType type) {
        this.type = type;
    }

    public boolean hasDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public boolean hasId() {
        return id;
    }

    public void setId(boolean id) {
        this.id = id;
    }

    public boolean hasBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(boolean bankAccount) {
        this.bankAccount = bankAccount;
    }
}
