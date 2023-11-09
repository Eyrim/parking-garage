package com.mfuller.parkinggarage;

import com.mfuller.parkinggarage.models.*;

public class VehicleFactory {
    public static Vehicle createVehicle(VehicleType vehicleType, LicensePlate licensePlate) {
        return switch (vehicleType) {
            case CAR -> new Car(licensePlate);
            case MOTORBIKE -> new MotorBike(licensePlate);
            case VAN -> new Van(licensePlate);
        };
    }
}
