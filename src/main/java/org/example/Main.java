package org.example;

import org.example.entity.Renter;
import org.example.entity.RenterType;
import org.example.manager.AvailableItemsManager;
import org.example.service.*;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.example.entity.RenterType.Company;

public class Main {
    static {
        Logger rootLogger = Logger.getLogger("");
        rootLogger.setLevel(Level.OFF);
    }

    public static void main(String[] args) {
        AvailableItemsManager manager = new AvailableItemsManager();

        Renter miharisoa = new Renter("Miharisoa",RenterType.Personal, false, true , false);
        Renter rindra = new Renter("Rindra", RenterType.Personal, true, true, false);
        Renter mitsoa = new Renter("Mitsoa",RenterType.Personal, false, true , true);
        Renter stark = new Renter("Stark Industries", Company,true, true, true);
        Renter wayLee = new Renter("Way Lee", RenterType.Association, false,false,false);

        manager.getCar("Mercedes_Sprinter").ifPresent(car -> {
            Renting rentCarService = new RentACar(wayLee,car,5);
            System.out.println(rentCarService.rent());
        });

        manager.getHouse("A_house").ifPresent(house -> {
            Renting rentHouseService = new RentHouse(mitsoa,house,6);
            System.out.println(rentHouseService.rent());
        });

        Renting rentMoneyService = new RentMoney(stark, 1000000.0, 7);
        System.out.println(rentMoneyService.rent());

        manager.getPc("A_pc").ifPresent(pc -> {
            Renting rentPcService = new RentPc(rindra,pc,12);
            System.out.println(rentPcService.rent());
        });

        manager.getBike("A_bike").ifPresent(bike -> {
            Renting rentBikeService = new RentBike(miharisoa,bike,1);
            System.out.println(rentBikeService.rent());
        });
    }
}