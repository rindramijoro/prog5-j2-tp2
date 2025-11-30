package org.example.service;

import org.example.entity.Car;
import org.example.entity.Renter;

public class RentACar extends AbstractRenting{
    private Car car;
    private int duration;

    public RentACar(Renter renter, int duration) {
        super(renter);
        this.duration = duration;
    }

    @Override
    protected boolean preconditions() {
        return renter.hasDriverLicense();
    }

    @Override
    protected String rentTheRentable() {
        return renter.getName()+ " rented a " +car.getModel()+ " for "+duration+ " day(s).";
    }

    @Override
    protected String failureMessage() {
        return renter.getName()+ " does not have any driver's license";
    }
}
