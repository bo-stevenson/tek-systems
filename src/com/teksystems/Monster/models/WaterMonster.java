package com.teksystems.Monster.models;

public class WaterMonster extends Monster{
    //fields

    //constructors
    public WaterMonster(String name){
        super(name);
    }

    //methods
    @Override
    public String attack(){
        return "Attack with water!";
    }

}//end class
