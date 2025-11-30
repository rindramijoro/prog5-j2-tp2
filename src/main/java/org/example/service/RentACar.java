package org.example.service;

import org.example.entity.Car;

public class RentACar implements Renting<Car, Integer>{
    public final Integer defaultDuration;

    public RentACar(Integer defaultDuration) {
        this.defaultDuration = defaultDuration;
    }

    @Override
    public String rent(Car car, Integer duration) {
        return this+ " rented " +car.getCarModel()+ " for " +duration+ " days";
    }
}
