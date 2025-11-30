package org.example.service;

import org.example.entity.Renter;

public class RentMoney extends AbstractRenting{
    private final Double amount;
    private final Integer duration;

    public RentMoney(Renter renter, Double amount, Integer duration) {
        super(renter);
        this.amount = amount;
        this.duration = duration;
    }

    @Override
    protected boolean preconditions() {
        return renter.hasId() && renter.hasBankAccount();
    }

    @Override
    protected String rentTheRentable() {
        return renter.getName()+ " rented "+amount+ " Ar for "+duration+ " days";
    }

    @Override
    protected String failureMessage() {
        return renter.getName()+ " cannot rent money because they don't how ID or bank account";
    }
}
