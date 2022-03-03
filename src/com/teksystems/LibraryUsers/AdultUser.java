package com.teksystems.LibraryUsers;

public class AdultUser implements LibraryUser{
    int age;
    String bookType;

    @Override
    public void registerAccount() {
        if (age > 12){
            System.out.println("You have successfully registered under an Adult Account");
        }else if(age < 12 ){
            System.out.println("Sorry, Age must be greater than 12 to register as an Adult");
        }

    }

    @Override
    public void requestBook() {

        if(bookType == "Fiction") {
            System.out.println("Book Issued Successfully, please return within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only Adult Fiction books");
        }

    }
}

