package com.mfuller.parkinggarage.models;

public enum SpaceSize {
    SMALL(2400L, 4800L),
    MEDIUM(2600L, 5500L),
    LARGE(3000L, 6000L);

    public final long widthInMillimeters;
    public final long heightInMillimeters;

    private SpaceSize(long widthInMillimeters, long heightInMillimeters) {
        this.widthInMillimeters = widthInMillimeters;
        this.heightInMillimeters = heightInMillimeters;
    }
}
