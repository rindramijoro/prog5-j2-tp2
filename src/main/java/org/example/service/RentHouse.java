package org.example.service;

import org.example.entity.House;
import org.example.entity.Renter;

public class RentHouse extends AbstractRenting {
    private final House house;
    private final Integer duration;

    public RentHouse(Renter renter, House house, Integer duration) {
        super(renter);
        this.house = house;
        this.duration = duration;
    }

    @Override
    protected boolean preconditions() {
        return house != null;
    }

    @Override
    protected String rentTheRentable() {
        return renter.getName()+ " rented a house for " +duration+ " months";
    }

    @Override
    protected String failureMessage() {
        return "The house you're trying to rent does not exist";
    }
}
