package com.company;

import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //premitive types

        int age=30;
        age=35;
        int viewCount=3_123_145;
        long price=12355415L;
        float priceFloat=10.68F;
        System.out.println(viewCount);
        System.out.println(age);
        System.out.println("Hello World");

        //reference type
        Date now=new Date();
        System.out.println(now);


        Point point1=new Point(1,2);

        Point point2=point1;

        String message=new String("Hello World"+"!!");
        System.out.println(message);
        var check=message.endsWith("!!");
        System.out.println(check);
        System.out.println(message.length());
        System.out.println(message.replace("!","*"));
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());

        System.out.println("Hello \"Mosh\"");
    }
}
