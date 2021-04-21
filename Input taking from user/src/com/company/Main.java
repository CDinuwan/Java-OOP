package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	byte age=scanner.nextByte();
	System.out.println("You are "+age);

	Scanner scanner1=new Scanner(System.in);
	String name=scanner.nextLine().trim();
	System.out.println(name);
    }
}
