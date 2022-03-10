package com.teksystems.cafe;

public class Espresso extends Product{

    boolean extraShot;
    boolean macchiato;

    public Espresso(String name, double price, String description) {
        super(name, price, description);
    }
    public Espresso(String name, double price, String description, boolean extraShot, boolean macchiato) {
        super(name,price,description);
        this.extraShot = extraShot;
        this.macchiato = macchiato;
    }

    @Override
    public void addOptions(int option) {
        switch (option) {
            case 1:
                extraShot = true;
                macchiato = true;
                break;
            case 2:
                extraShot = false;
                macchiato = false;
                break;
            case 3:
                extraShot = true;
                break;
            case 4:
                macchiato = true;
                break;
            default:
                System.out.println("Please choose a valid option");

        }
    }

    @Override
    public void printOptions() {
        System.out.println("Please select any extras you would like: ");
        System.out.println("1: Both 2: Neither 3: Just an Extra Shot 4: Just Macchiato");

    }

    @Override
    public String toString() {
        return String.format("Item:\t%-16sPrice: $%.2f\tQty: %d\tSubtotal: $%.2f\nExtra Shot: %s\tMacchiato: %s\n",
                super.getName(), super.getPrice(), super.getQuantity(), calculateProductTotal(), extraShot ? "Yes" : "No", macchiato ? "Yes" : "No" );
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

        return price * quantity;


    }

    @Override
    public Espresso getBeverage() {
        return new Espresso(getName(), getPrice(), getDescription());
    }
}
