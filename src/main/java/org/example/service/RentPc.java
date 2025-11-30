package org.example.service;

import org.example.entity.Pc;
import org.example.entity.Renter;

public class RentPc extends AbstractRenting{
    private final Pc pc;
    private final Integer duration;

    public RentPc(Renter renter, Pc pc, Integer duration) {
        super(renter);
        this.pc = pc;
        this.duration = duration;
    }


    @Override
    protected boolean preconditions() {
        return pc != null;
    }

    @Override
    protected String rentTheRentable() {
        return renter.getName()+ " rented a Pc for " +duration+ " days";
    }

    @Override
    protected String failureMessage() {
        return "The Pc you're trying to rent does not exist";
    }
}
