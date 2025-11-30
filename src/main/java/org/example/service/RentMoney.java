package org.example.service;

import org.example.entity.Renter;

import java.math.BigDecimal;

public class RentMoney extends AbstractRenting{
    private final BigDecimal amount;
    private final Integer duration;

    public RentMoney(Renter renter, BigDecimal amount, Integer duration) {
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
