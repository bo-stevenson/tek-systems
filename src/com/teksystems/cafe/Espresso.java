package com.teksystems.cafe;

public class Espresso extends Product{
    boolean extraShot;
    boolean macchiato;


    public Espresso() {
        super();
        this.extraShot = false;
        this.macchiato = true;
    }
    public Espresso(String name, double price, String description, boolean extraShot, boolean macchiato) {
        super(name,price,description);
        this.extraShot = extraShot;
        this.macchiato = macchiato;
    }

    @Override
    public double calculateProductTotal() {
        double price = super.getPrice();
        int quantity = super.getQuantity();

        if (extraShot == true) {
            price = price + 2;
        }
        if (macchiato == true) {
            price = price + 1;
        }

        double subtotal = price * quantity;

        return subtotal;
    }
}
