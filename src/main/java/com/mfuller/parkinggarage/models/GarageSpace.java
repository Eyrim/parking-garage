package com.mfuller.parkinggarage.models;

import com.mfuller.parkinggarage.GarageSpaceIdHandler;

public class GarageSpace {
    private final long spaceId;
    private Vehicle parkedVehicle;
    private final SpaceSize spaceSize;

    public GarageSpace(Vehicle parkedVehicle, SpaceSize spaceSize) {
        this.parkedVehicle = parkedVehicle;
        this.spaceId = GarageSpaceIdHandler.generateSpaceId();
        this.spaceSize = spaceSize;
    }

    public GarageSpace(Vehicle parkedVehicle, long spaceId, SpaceSize spaceSize) {
        this.parkedVehicle = parkedVehicle;
        this.spaceId = spaceId;
        this.spaceSize = spaceSize;
    }

    public Vehicle getParkedVehicle() {
        return this.parkedVehicle;
    }

    public void setParkedVehicle(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
    }

    public long getSpaceId() {
        return this.spaceId;
    }
}
