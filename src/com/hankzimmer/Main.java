package com.hankzimmer;

public class Main {

    public static void main(String[] args) {

        //Set up for PC
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "120", dimensions);
        Monitor theMonitor = new Monitor("27inch", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        //Implementing the PC
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        //Set up for room
        Couch couch = new Couch(3, "Ashley", "Gray");
        Tv tv = new Tv(60, "Samsung");
        Table table = new Table(4, 6, 40, "Wood");

        //Implementing the room
        Room livingRoom = new Room(couch, tv, table);
        livingRoom.prepareForDinner();
    }
}
