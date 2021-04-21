package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println("Hello");
        }
        int i=0;
        while(i<5){
            System.out.println("Hello World"+i);
            i++;
        }
        String input="";
        while(!input.equals("quit")){
            System.out.println("Input ");
            Scanner scanner =new Scanner(System.in);
            input=scanner.next().toLowerCase();
        }

        do{
            System.out.println(i);
            i++;
            if(i==10){
                break;
            }
        }while(i>5);

        int[] numbers=new int[]{1,2,3,4,5};
        for(int number:numbers){
            System.out.println(number);
        }
    }
}
