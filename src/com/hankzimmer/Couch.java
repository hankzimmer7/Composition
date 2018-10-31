package com.hankzimmer;

public class Couch {

    private int seats;
    private String brand;
    private String color;

    public Couch(int seats, String brand, String color) {
        this.seats = seats;
        this.brand = brand;
        this.color = color;
    }

    public int getSeats() {
        return seats;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
}
