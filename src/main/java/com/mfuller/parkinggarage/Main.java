package com.mfuller.parkinggarage;

import com.mfuller.parkinggarage.models.Garage;
import com.mfuller.parkinggarage.models.LicensePlate;
import com.mfuller.parkinggarage.models.VehicleType;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage(List.of(10, 15, 13, 2));

        garage.park(VehicleFactory.createVehicle(VehicleType.MOTORBIKE, new LicensePlate("LD15 UFX")), 40);
        garage.park(VehicleFactory.createVehicle(VehicleType.VAN, new LicensePlate("AT92LFD")), 10);

        garage.getSpaceById(9999L);

        System.out.println("");
    }
}
