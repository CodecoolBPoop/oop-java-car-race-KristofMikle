package com.codecool;

import java.util.ArrayList;

public class Race {
    private Weather weather = new Weather();
    private static final int raceHours = 50;
    private static  ArrayList<Vehicle> vehicleList= new ArrayList<>();

    private static ArrayList createVehicles() {
        // creates 10 cars, 10 trucks and 10 motorcycles
        ArrayList<Vehicle> raceVehicles = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            raceVehicles.add(new Motorcycle());
            raceVehicles.add(new Truck());
            raceVehicles.add(new Car());
        }
        return raceVehicles;
    }

    private void simulateRace(ArrayList<Vehicle> vehicles) {
        weather.setRaining();
        for (int hour = 0; hour < raceHours; hour++) {
            for (Vehicle vehicle : vehicles) {
                vehicle.moveForAnHour(this);
            }
        }
    }

    ArrayList<Vehicle> getVehicleList(){
        return vehicleList;
    }

    boolean isThereBrokenTruck(ArrayList<Vehicle> vehicles) {
        //TODO: Decide if there is a broken truck in the race.
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Truck) {
                if (((Truck) vehicle).isBrokenDown()) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean isRaining() {
        //TODO: Decide if it is raining now.
        return weather.isRaining();
    }

    private void printRaceResults(ArrayList<Vehicle> racers) {
        System.out.println("Final result:");
        for (Vehicle racer : racers) {
            System.out.print("Name: " + racer.name);
            System.out.print(", Type: " + racer.getClass());
            System.out.println(", Distance: "  + racer.getDistanceTraveled() + " km");
        }
    }

    public static void main(String[] args) {
	    // write your code here
        Race race = new Race();
        vehicleList = createVehicles();
        race.simulateRace(vehicleList);
        race.printRaceResults(vehicleList);
    }
}
