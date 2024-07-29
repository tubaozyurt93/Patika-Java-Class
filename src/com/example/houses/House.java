package com.example.houses;

public abstract class House {
    private String name;
    private double price;
    private double area;
    private int rooms;
    private int livingRooms;

    // Constructor
    public House(String name, double price, double area, int rooms, int livingRooms) {
        this.name = name;
        this.price = price;
        this.area = area;
        this.rooms = rooms;
        this.livingRooms = livingRooms;
    }

    // Getters and Setters
    public String getName() { return name; }
    public double getPrice() { return price; }
    public double getArea() { return area; }
    public int getRooms() { return rooms; }
    public int getLivingRooms() { return livingRooms; }
}
