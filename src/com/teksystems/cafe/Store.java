package com.teksystems.cafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {

    List<Product> products;
    Store(){
    products = new ArrayList<>();
    }

    Store(Product... products){
        this.products= new ArrayList<>(Arrays.asList(products));
    }

    public Product select(int option){
        if(option >= 1 && option <= products.size()) {
         return (products.get(option - 1).getBeverage());
        } else if (option == products.size() + 1) {
            return null;
        } else {
            System.out.println("Please select between 1 and 5");
            return null;
        }

    }

    public void printMenu() {
        System.out.println();
        System.out.println("Make a selection from the menu: ");
        for(int i = 0; i < products.size();i++)
            System.out.printf("%d: %s\t$%.2f\t%s%n", i + 1, products.get(i).getName(), products.get(i).getPrice(), products.get(i).getDescription());

        System.out.printf("%d: Check Out %n", products.size() + 1);
    }


    public List<Product> getProducts() {
        return this.products;
    }

    public Product getProduct(int index) {
        return this.products.get(index);
    }

    public void addProducts(Product... products) {
        this.products.addAll((Arrays.asList(products)));
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }
}


