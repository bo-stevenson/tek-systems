package com.teksystems.cafe;

public class Coffee extends Product {


    boolean sugar;
    boolean milk;

    public Coffee(String name, double price, String description) {
        super(name, price, description);
    }

    public Coffee(String name, double price, String description, boolean milk, boolean sugar) {
        super(name, price, description);
        this.milk = milk;
        this.sugar = sugar;
    }

    @Override
    public double calculateProductTotal() {

        double price = super.getPrice();
        int quantity = super.getQuantity();
        return price * quantity;

    }
    @Override
    public String toString() {
        return String.format("Item:\t%-16sPrice: $%.2f\tQty: %d\tSubtotal: $%.2f\nMilk: %s\tSugar: %s\n",
                super.getName(), super.getPrice(), super.getQuantity(), calculateProductTotal(), milk ? "Yes" : "No", sugar ? "Yes" : "No" );
    }
    @Override
    public Coffee getBeverage() {
        return new Coffee(getName(),getPrice(),getDescription());
    }



    @Override
    public void addOptions(int option) {
        switch (option) {
            case 1:
                sugar = true;
                milk = true;
                break;
            case 2:
                sugar = false;
                milk = false;
                break;
            case 3:
                sugar = true;
                break;
            case 4:
                milk = true;
                break;
            default:
                System.out.println("Please choose a valid option");

        }
    }

    @Override
    public void printOptions() {
        System.out.println("Please select any extras you would like: ");
        System.out.println("1: Both 2: Neither 3: Just Sugar 4: Just Milk");

    }

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }


}
