package com.mfuller.parkinggarage.models;

public abstract class Vehicle {
    protected final LicensePlate licensePlate;

    public Vehicle(LicensePlate licensePlate) {
        this.licensePlate = licensePlate;
    }
}
