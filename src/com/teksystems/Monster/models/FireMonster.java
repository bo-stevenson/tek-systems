package com.teksystems.Monster.models;

public class FireMonster extends Monster{
    //fields

    //constructors
    public FireMonster(String name){
        super(name);
    }

    //methods
    @Override
    public String attack(){
        return "Attack with fire!";
    }

}// end class
