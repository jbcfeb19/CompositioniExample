package com.company;

import java.util.ArrayList;

public class Car {

    // private member variables can be
    private String make;
    private String model;
    private int year;
    private double speed;

    //Since a car contains multiple doors I use an arraylist
    private ArrayList<Door> doors;
    private Engine engine;
    private Windshield windshield;

    public Car() {
    }

    public Car(String make, String model, int year,
               double speed, ArrayList<Door> doors, Engine engine,
               Windshield windshield) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.doors = doors;
        this.engine = engine;
        this.windshield = windshield;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public ArrayList<Door> getDoors() {
        return doors;
    }

    public void setDoors(ArrayList<Door> doors) {
        this.doors = doors;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Windshield getWindshield() {
        return windshield;
    }

    public void setWindshield(Windshield windshield) {
        this.windshield = windshield;
    }


    // a helper method for locking all the doors from the car
    public void lock(boolean locked){
        //lock every door
        for (Door d:doors){
            d.setLocked(locked);
        }
    }

    @Override
    public String toString(){
         return "Car information";
    }
}
