package com.mfuller.parkinggarage.models;

import java.util.Arrays;
import java.util.regex.Pattern;

public record LicensePlate(String registration) {
    public LicensePlate(String registration) {
        this.registration = validateRegistration(registration) ? registration : null;
    }

    /**
     * Validates the input plate, only checks format
     * @param registration The plate to check
     * @return True if the plate is valid in terms of format, false otherwise
     */
    private boolean validateRegistration(String registration) {
        // Matches UK License plates as per format: AANN AAA (A=Alpha, N=Number)
        Pattern regex = Pattern.compile("^[A-Za-z]{2}[0-9]{2}\\s?[A-Za-z]{3}+$");

        return regex.matcher(registration).matches();
    }
}
