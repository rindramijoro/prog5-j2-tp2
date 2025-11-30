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

    public boolean hasDriverLicense() {
        return driverLicense;
    }

    public boolean hasId() {
        return id;
    }

    public boolean hasBankAccount() {
        return bankAccount;
    }

}
