package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value : ");
        int checkPrime=scanner.nextInt();

        boolean isPrime=false;

        for(int i=2;i<checkPrime;i++){
            if(checkPrime%i==0){
                isPrime =false;
                break;
            }else{
                isPrime=true;
            }
        }
        if(isPrime){
            System.out.println("The number is prime number");
        }
    }
}
