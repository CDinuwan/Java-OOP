package com.company;

public class Main {

    public static void main(String[] args) {
        try
        {
            throw new ArithmeticException("Demo");
//            int a=10,b=0;
//            int c=a/b;
        }catch(ArithmeticException er)
        {
            System.out.println(er.getMessage());
        }
        finally {
            System.out.println("Error handling done");
        }
    }
}
