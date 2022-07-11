package com.company;

public class Product {
    private static int id = 1;
    private double price;
    private int discountRate;
    private int amount;
    private String name;
    private Make make;
    private String memory;
    private String screenSize;
    private int batteryPower;
    private String ram;
    private String color;

    public Product(double price, int discountRate, int amount, String name, Make make, String memory, String screenSize, int batteryPower, String ram, String color) {
        this.price = price;
        this.discountRate = discountRate;
        this.amount = amount;
        this.name = name;
        this.make = make;
        this.memory = memory;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;
    }

    public int getId(){
        return id;
    }
    public double getPrice() {
        return price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public Make getMake() {
        return make;
    }

    public String getMemory() {
        return memory;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public String getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }

    public void getProductInfo(){
        String table = "| \t ID \t | \t Product Name \t\t\t | Price \t\t | Make \t\t | Memory \t\t | Screen Size \t\t |" +
                " RAM \t\t |";
        String info = "| \t" + getId() +"\t | \t"+ getName()+" \t\t\t | "+ getPrice() +" \t\t | "+ getMake() +
                " \t\t | "+getMemory() +" \t\t | " + getScreenSize() +"  \t\t | " +
                getRam()+"\t\t |";
        System.out.println(table);
        System.out.println(info);
    }
}
