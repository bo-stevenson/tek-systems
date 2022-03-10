package com.teksystems.cafe;

import java.util.Scanner;

public class CafeApp {

    public static void main(String[] args) {

        Coffee coffee = new Coffee("Coffee", 2.5, "Black Coffee", true, false);
        Espresso espresso = new Espresso("Espresso", 2.25, "Shot of Espresso", false, true);
        Cappuccino cappuccino = new Cappuccino("Cappuccino", 3.25, "Classic Cappuccino", true, false);

        Store store = new Store(coffee, espresso, cappuccino);
        ShoppingCart shoppingCart = new ShoppingCart();


        store.printMenu();
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            if (input.hasNextInt()) {

                Product product = store.select(input.nextInt());
                if (product == null) break;
                input.nextLine();

                System.out.println("Select Quantity: ");
                while (input.hasNext()) {
                    if (input.hasNextInt()) {
                        int quantity = input.nextInt();
                        if (quantity > 0) {
                            product.setQuantity(quantity);
                            break;
                        } else {
                            System.out.println("Must be more than zero");
                        }
                    } else {
                        System.out.println("Enter a number: ");
                    }
                    input.nextLine();

                }

                input.nextLine();

                System.out.println();
                product.printOptions();
                while (input.hasNext()) {
                    if (input.hasNextInt()) {
                        int option = input.nextInt();
                        product.addOptions(option);
                        break;
                    } else {
                        System.out.println("Enter a number: ");
                    }
                    input.nextLine();
                }

                shoppingCart.addProduct(product);
                System.out.printf("%n%s added to cart", product.getName());

                store.printMenu();


            }else{
                System.out.println("Enter a number: ");
            }
            input.nextLine();
        }
        input.close();
        shoppingCart.checkout();


    }
}
