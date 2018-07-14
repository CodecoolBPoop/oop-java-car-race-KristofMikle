package com.codecool;

public class Truck extends Vehicle {
    private static final int normalSpeed = 100;
    private int breakDownTurnsLeft = 0;
    private static final int brokingDownLength = 2;

    Truck() {
        name = Integer.toString(rand.nextInt(1000));
        if (isBrokingDown()) {brokeDown();}
    }

    boolean isBrokenDown() {
        return this.breakDownTurnsLeft != 0;
    }

    private boolean isBrokingDown() {
        return rand.nextInt(101) <= 5;
    }

    private void brokeDown() {
        breakDownTurnsLeft = brokingDownLength;
    }

    void moveForAnHour(Race race) {
        if (!isBrokenDown() && isBrokingDown()) {brokeDown();}
        else if (isBrokenDown()) {breakDownTurnsLeft--;} else {distanceTraveled += normalSpeed;}
    }
}
