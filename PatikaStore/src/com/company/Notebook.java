package com.company;

public class Notebook extends Product {
    private static int id = 1;

    public Notebook(double price, int discountRate, int amount, String name, Make make, String memory, String screenSize, int batteryPower, String ram, String color) {
        super(price, discountRate, amount, name, make, memory, screenSize, batteryPower, ram, color);
        this.id++;
    }

}