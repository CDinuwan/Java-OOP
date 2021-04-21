package com.company;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final float pi=3.14F;//Calling as constant
        int result=10+3;
        System.out.println(result);
        int x=1;
        ++x;
        System.out.println(x);
        int result1=10/3;
        System.out.println(result1);

        //Casting
        short x1=1;
        int y=x1+2;
        System.out.println(y);

        double x2=1.1;
        int y2=(int)x+2;
        System.out.println(y2);

        String w="1";
        int e=Integer.parseInt(w)+2;
        System.out.println(e);

        System.out.println(Math.round(1.2));
        System.out.println(Math.ceil(1.1F));

        double r=(int)(Math.random()*100);
        System.out.println(r);

        NumberFormat currency=NumberFormat.getCurrencyInstance();
        String precent=currency.format(12354654654.8454);

        System.out.println(precent);
    }
}
