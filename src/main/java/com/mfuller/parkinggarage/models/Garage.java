package com.mfuller.parkinggarage.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Garage {
    private final GarageFloor[] floors;

    public Garage(List<Integer> floorSizes) {
        this.floors = generateFloors(floorSizes);
    }

    public Garage(GarageFloor[] floors) {
        this.floors = floors;
    }

    public GarageFloor[] generateFloors(List<Integer> floorSizes) {
        ArrayList<GarageFloor> generatedFloors = new ArrayList<>(floorSizes.size());

        floorSizes.forEach(
                floorSize -> generatedFloors.add(new GarageFloor(floorSize))
        );

        return generatedFloors.toArray(GarageFloor[]::new);
    }

    public GarageSpace getSpaceById(long spaceId) {
        for (GarageFloor floor : this.floors) {
            for (GarageSpace space : floor.getGarageSpaces()) {
                if (space.getSpaceId() == spaceId) {
                    return space;
                }
            }
        }

        throw new GarageSpaceNotFoundException(String.format(
                "Could not find garage space with ID: %d",
                spaceId
        ));
    }

    public boolean park(Vehicle vehicle, long spaceId) {
        if (getSpaceById(spaceId).getParkedVehicle() == null) {
            getSpaceById(spaceId).setParkedVehicle(vehicle);

            return true;
        }

        return false;
    }

    public Vehicle unpark(long spaceId) {
        Vehicle wasParked;

        wasParked = getSpaceById(spaceId).getParkedVehicle();
        // Empty space for next vehicle
        getSpaceById(spaceId).setParkedVehicle(null);

        return wasParked;
    }

    static class GarageSpaceNotFoundException extends RuntimeException {
        public GarageSpaceNotFoundException(String message) {
            super(message);
        }
    }
}
