package org.example.service;

import org.example.entity.Renter;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractRenting implements Renting{
    protected final Renter renter;
    protected final Logger logger = Logger.getLogger(this.getClass().getName());

    public AbstractRenting(Renter renter) {
        this.renter = renter;
    }

    @Override
    public String rent() {
        try {
            if (preconditions()) {
                String result = rentTheRentable();
                System.out.println(result);
                logger.log(Level.INFO, "Renting successful: ", result);
            } else {
                String failed = failureMessage();
                System.out.println(failed);
                logger.log(Level.WARNING, "Failed to rent : ", failed);
            }
        } catch (Exception e) {
            logger.log(Level.WARNING, "Unexpected error", e);
            return "An error occurred";
        }
        return "";
    }

    protected abstract boolean preconditions();
    protected abstract String rentTheRentable();
    protected abstract String failureMessage();
}
