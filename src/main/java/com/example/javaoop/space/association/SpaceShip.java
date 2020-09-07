package com.example.javaoop.space.association;

public class SpaceShip {
    private String model;
    private String captain;
    private String destination;
    private double fuelLeft;

    public SpaceShip(String model, String captain, String destination, double fuelLeft) {
        this.model = model;
        this.captain = captain;
        this.destination = destination;
        this.fuelLeft = fuelLeft;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getFuelLeft() {
        return fuelLeft;
    }

    public void setFuelLeft(double fuelLeft) {
        this.fuelLeft = fuelLeft;
    }

    public void showStatus() {
        System.out.println("Im on my way to " + destination + " says captain " + captain);
    }
}
