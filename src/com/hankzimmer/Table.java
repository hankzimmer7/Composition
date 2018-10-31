package com.hankzimmer;

public class Table {

    private int legs;
    private int seats;
    private int height;
    private String material;

    public Table(int legs, int seats, int height, String material) {
        this.legs = legs;
        this.seats = seats;
        this.height = height;
        this.material = material;
    }

    public void setTable() {
        System.out.println("Set the table for dinner");
    }

    public int getLegs() {
        return legs;
    }

    public int getSeats() {
        return seats;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }
}
