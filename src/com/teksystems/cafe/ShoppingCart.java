package com.teksystems.cafe;

public class ShoppingCart extends Store{


    ShoppingCart(){
        super();
    }

    ShoppingCart(Product... products) {
        super(products);
    }

    public void checkout() {
        float subtotal = 0f;

        for(Product product : products) {
            subtotal += product.calculateProductTotal();
            System.out.println(product);
        }

        float salesTax = (float) (subtotal * 0.08);

        float totalSale = subtotal + salesTax;

        System.out.printf("Subtotal: $%.2f%nSales Tax: $%.2f%nTotal Sale: $%.2f%n", subtotal, salesTax, totalSale);

    }
}
