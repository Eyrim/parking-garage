package com.mfuller.parkinggarage.models;

import java.util.Random;

public class GarageFloor {
    private final GarageSpace[] garageSpaces;

    public GarageFloor(int spaceCount) {
        this.garageSpaces = generateSpaces(spaceCount);
    }

    public GarageSpace[] getGarageSpaces() {
        return this.garageSpaces;
    }

    private GarageSpace[] generateSpaces(int spaceCount) {
        GarageSpace[] generatedSpaces = new GarageSpace[spaceCount];

        for (int i = 0; i < spaceCount; i++) {
            generatedSpaces[i] = new GarageSpace(null, generateSpaceSize());
        }

        return generatedSpaces;
    }

    // For demonstration purposes
    private SpaceSize generateSpaceSize() {
        Random rand = new Random();

        switch (rand.nextInt(1, 4)) {
            case 1 -> {
                return SpaceSize.SMALL;
            }
            case 2 -> {
                return SpaceSize.MEDIUM;
            }
            case 3 -> {
                return SpaceSize.LARGE;
            }
        }

        return null;
    }
}
