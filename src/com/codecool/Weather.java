package com.codecool;

import java.util.Random;

public class Weather {
    private static boolean isRainingNow = false;

    private static Random rand = new Random();

     void setRaining() {
        //TODO: There is 30% chance of raining.
        if (rand.nextInt(101) <= 30) {
            isRainingNow = true;
        } else {
            isRainingNow = false;
        }
    }

    boolean isRaining() {
        //TODO: Is it raining currently?
        return isRainingNow;
    }
}
