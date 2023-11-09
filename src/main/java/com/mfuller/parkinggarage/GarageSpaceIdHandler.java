package com.mfuller.parkinggarage;

public abstract class GarageSpaceIdHandler {
    private static long previousId;

    public static long generateSpaceId() {
        previousId++;

        return previousId;
    }
}
