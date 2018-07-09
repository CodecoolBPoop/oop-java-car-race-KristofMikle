package com.codecool;

import java.util.Random;

public abstract class Vehicle {
    int normalSpeed;
    String name;
    long distanceTraveled = 0;
    Random rand = new Random();

    abstract void moveForAnHour(Race race);

    long getDistanceTraveled() {
        return distanceTraveled;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Distance traveled: " + distanceTraveled;
    }
}
