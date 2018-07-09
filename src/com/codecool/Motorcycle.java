package com.codecool;

public class Motorcycle extends Vehicle {
    private static int nameNumber = 1;
    private static final int normalSpeed = 100;

    Motorcycle() {
        name = "Motorcycle " + nameNumber++;
    }

    void moveForAnHour(Race race) {
        if (race.isRaining()) {distanceTraveled += normalSpeed - (rand.nextInt(46) + 5);} else {distanceTraveled += normalSpeed;}
    }
}
