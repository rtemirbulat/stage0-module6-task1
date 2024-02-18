package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    public String getDescription(){
        String paws = null;
        String furValue = null;
        switch(numberOfPaws){
            case 0:
                paws = " no paws";
                break;
            case 1:
                paws = " paw";
                break;
            default:
                paws = " paws";

        }
        if(hasFur){
            furValue = "a ";
        }
        else{
            furValue ="no ";
        }
        return "This animal is mostly " + color + ". It has "+numberOfPaws+ paws+ " and "+ furValue+ "fur.";
    }
}

