package com.hankzimmer;

public class Room {

    private Couch couch;
    private Tv tv;
    private Table table;

    public Room(Couch couch, Tv tv, Table table) {
        this.couch = couch;
        this.tv = tv;
        this.table = table;
    }

    public void prepareForDinner() {
        table.setTable();
        tv.turnOff();
        sweepFloor();
    }

    private void sweepFloor() {
        System.out.println("Swept the floor");
    }
}
