package org.example.manager;

import org.example.entity.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AvailableItemsManager {
    private final Map<String, RentableItem> availableItems = new HashMap<>();

    public AvailableItemsManager() {
        availableItems.put("Mercedes_Sprinter", new Car("Mercedes Sprinter", CarType.Bus));
        availableItems.put("A_bike",new Bike("City touring", BikeType.City));
        availableItems.put("A_house", new House("123 Analakely Sud", HouseType.Studio));
        availableItems.put("A_pc", new Pc("Dell G7", PcType.Laptop));
    }

    public Optional<Car> getCar(String model) {
        return Optional.ofNullable(availableItems.get(model))
                .filter(item -> item instanceof Car)
                .map(item -> (Car) item);
    }

    public Optional<House> getHouse(String model) {
        return Optional.ofNullable(availableItems.get(model))
                .filter(item -> item instanceof House)
                .map(item -> (House) item);
    }

    public Optional<Bike> getBike(String model) {
        return Optional.ofNullable(availableItems.get(model))
                .filter(item -> item instanceof Bike)
                .map(item -> (Bike) item);
    }

    public Optional<Pc> getPc(String model) {
        return Optional.ofNullable(availableItems.get(model))
                .filter(item -> item instanceof Pc)
                .map(item -> (Pc) item);
    }
}
