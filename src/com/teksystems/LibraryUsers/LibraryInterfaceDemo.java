package com.teksystems.LibraryUsers;

public class LibraryInterfaceDemo {

    public static void testOne() {
        KidUsers kid = new KidUsers();
        kid.age = 10;
        kid.registerAccount();
        kid.age = 18;
        kid.registerAccount();
        kid.bookType = "Kids";
        kid.requestBook();
        kid.bookType = "Fiction";
        kid.requestBook();
    }

    public static void testTwo() {
        AdultUser adult = new AdultUser();
        adult.age = 5;
        adult.registerAccount();
        adult.age = 23;
        adult.registerAccount();
        adult.bookType = "Kids";
        adult.requestBook();
        adult.bookType = "Fiction";
        adult.requestBook();

    }

    public static void main(String[] args) {
        testOne();
        System.out.println();
        testTwo();

    }
}
