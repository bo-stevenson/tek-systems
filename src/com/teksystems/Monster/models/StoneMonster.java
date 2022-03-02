package com.teksystems.Monster.models;

public class StoneMonster extends Monster{
    //fields

    //constructors
    public StoneMonster(String name){
        super(name);
    }

    //methods
    @Override
    public String attack(){
        return "Attack with stones!";
    }

}//end class
