package com.teksystems.cafe;

public class Cappuccino extends Product{

    boolean peppermint;
    boolean whippedCream;

    public Cappuccino(String name, double price, String description){
        super(name,price,description);
    }

    public Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream){
        super(name, price, description);
        this.peppermint = peppermint;
        this.whippedCream = whippedCream;
    }

    @Override
    public void addOptions(int option) {
        switch (option) {
            case 1:
                peppermint = true;
                whippedCream = true;
                break;
            case 2:
                peppermint = false;
                whippedCream = false;
                break;
            case 3:
                peppermint = true;
                break;
            case 4:
                whippedCream = true;
                break;
            default:
                System.out.println("Please choose a valid option");

        }
    }


    @Override
    public void printOptions() {
        System.out.println("Please select any extras you would like: ");
        System.out.println("1: Both 2: Neither 3: Just Peppermint 4: Just Whipped Cream");

    }
    @Override
    public String toString() {
        return String.format("Item:\t%-16sPrice: $%.2f\tQty: %d\tSubtotal: $%.2f\nPeppermint: %s\tWhipped Cream: %s\n",
                super.getName(), super.getPrice(), super.getQuantity(), calculateProductTotal(), peppermint ? "Yes" : "No", whippedCream ? "Yes" : "No" );
    }



    @Override
    public double calculateProductTotal() {
        double price = super.getPrice();
        int quantity = super.getQuantity();

        if (peppermint){
            price = price + 2;
        }
        if (whippedCream){
            price = price + 1;
        }

        return price * quantity;
    }

    @Override
    public Cappuccino getBeverage() {
        return new Cappuccino(getName(),getPrice(),getDescription());
    }
}
