package com.company;

public class Phone extends Product {
    private static int id = 1;

    public Phone(double price, int discountRate, int amount, String name, Make make, String memory, String screenSize, int batteryPower, String ram, String color) {
        super(price, discountRate, amount, name, make, memory, screenSize, batteryPower, ram, color);
        id++;
    }



}
