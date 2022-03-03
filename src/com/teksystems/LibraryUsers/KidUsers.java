package com.teksystems.LibraryUsers;

public class KidUsers implements LibraryUser{
    int age;
    String bookType;

    @Override
    public void registerAccount() {
        if (age < 12){
            System.out.println("You have successfully registered under a Kid's Account");
        }else if(age > 12 ){
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }

    }

    @Override
    public void requestBook() {

        if(bookType == "Kids") {
            System.out.println("Book Issued Successfully, please return within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }

    }
}
