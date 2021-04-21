package com.company;

import static java.util.logging.Logger.global;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int temp=32;
        if(temp>30){
            System.out.println("Is a hot day");
            System.out.println("Drink a water");
        }
        else if(temp>20 && temp<=30){
            System.out.println("Beautiful day");
        }
        else{
            System.out.println("Cold day");
        }

        int income=120_000;
        boolean hasHighIncome=(income>100_000);

        //Ternary Operator
        String className;
        if(income>100_000)
            className="First";

        String className1=income>100_000 ? "First" : "Economy";
        System.out.println(className1);
    }
}
