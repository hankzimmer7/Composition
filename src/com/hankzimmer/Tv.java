package com.hankzimmer;

public class Tv {
    private int size;
    private String brand;

    public Tv(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    public void turnOff() {
        System.out.println("Turned off the TV");
    }
    public int getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }
}
