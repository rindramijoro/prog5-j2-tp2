package org.example.service;

import org.example.entity.Bike;
import org.example.entity.Renter;

public class RentBike extends AbstractRenting{
    private final Bike bike;
    private final Integer duration;

    public RentBike(Renter renter, Bike bike, Integer duration) {
        super(renter);
        this.bike = bike;
        this.duration = duration;
    }

    @Override
    protected boolean preconditions() {
        return bike != null;
    }

    @Override
    protected String rentTheRentable() {
        return renter+ " rented a bike for " +duration+ " day(s)";
    }

    @Override
    protected String failureMessage() {
        return "The bike you're trying to rent does not exist";
    }
}
