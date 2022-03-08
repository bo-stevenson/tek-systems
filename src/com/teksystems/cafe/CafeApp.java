package com.teksystems.cafe;

import java.util.Scanner;

public class CafeApp {

    public static void main(String[] args){

        Coffee coffee = new Coffee("Coffee", 2.5, "Black", true, false);
        Espresso espresso = new Espresso("Espresso", 2.25, "Shot of Espresso", false, true);
        Cappuccino cappuccino = new Cappuccino("Cappuccino", 3.25,"Classic Cappuccino",true,false);

        Scanner input = new Scanner(System.in);
        System.out.println("How many coffees do you want?");
        int coffeeQuantity = input.nextInt();
        coffee.setQuantity(coffeeQuantity);
        double coffeeSubtotal = coffee.calculateProductTotal();
        System.out.println(coffee.getName() + " " + coffee.getDescription() + " Subtotal: " + coffeeSubtotal);

        System.out.println();

        System.out.println("How many espressos would you like?");
        int espressoQuantity = input.nextInt();
        espresso.setQuantity(espressoQuantity);
        double espressoSubtotal = espresso.calculateProductTotal();
        System.out.println(espresso.getName() + " " + espresso.getDescription() + " Subtotal: " + espresso.calculateProductTotal());

        System.out.println();

        System.out.println("How many cappuccinos would you like?");
        int cappuccinoQuantity = input.nextInt();
        cappuccino.setQuantity(cappuccinoQuantity);
        double cappuccinoSubtotal = cappuccino.calculateProductTotal();
        System.out.println(cappuccino.getName() + " " + cappuccino.getDescription() + " Subtotal: " + cappuccino.calculateProductTotal());

        System.out.println();

        double salesSubtotal = coffeeSubtotal + espressoSubtotal + cappuccinoSubtotal;
        double salesTax = salesSubtotal * 0.0625;
        double salesTotal= salesSubtotal + salesTax;
        System.out.printf("\nSubtotal: $%.2f\nSales Tax: $%.2f\nSales Total: $%.2f\n", salesSubtotal, salesTax, salesTotal);



    }
}
