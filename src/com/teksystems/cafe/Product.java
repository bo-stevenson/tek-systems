package com.teksystems.cafe;

public abstract class Product {

    private String name;
    private double price;
    private String description;
    private int quantity;

    Product(){

    }

    Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;

    }

    public abstract void addOptions(int option);

    public abstract void printOptions();

    public abstract double calculateProductTotal();

    public abstract Product getBeverage();

//    @Override
//    public String toString() {
//        return String.format("Item:\t%-16sPrice: $%.2d\tQty: %d\tSubtotal: $%.2f", name, price, quantity, calculateProductTotal());
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}

