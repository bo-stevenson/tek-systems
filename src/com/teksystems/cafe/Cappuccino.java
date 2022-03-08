package com.teksystems.cafe;

public class Cappuccino extends Product{
    boolean peppermint;
    boolean whippedCream;

    public Cappuccino(){
        super();
        this.peppermint = false;
        this.whippedCream = false;
    }

    public Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream){
        super(name, price, description);
        this.peppermint = peppermint;
        this.whippedCream = whippedCream;
    }

    @Override
    public double calculateProductTotal() {
        double price = super.getPrice();
        int quantity = super.getQuantity();

        if (peppermint == true){
            price = price + 2;
        }
        if (whippedCream == true){
            price = price + 1;
        }

        return price * quantity;
    }
}
