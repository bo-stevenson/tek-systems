package com.teksystems.cafe;

public class Coffee extends Product{

    boolean sugar;
    boolean milk;
    public Coffee(){
        super();
        this.milk = false;
        this.sugar = false;
    }

    public Coffee(String name, double price, String description, boolean milk, boolean sugar){
        super(name, price, description);
        this.milk = milk;
        this.sugar = sugar;
    }

    public boolean isSugar(){
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


    @Override
    public double calculateProductTotal() {

        double price = super.getPrice();
        int quantity = super.getQuantity();
       return price * quantity;

    }
}
