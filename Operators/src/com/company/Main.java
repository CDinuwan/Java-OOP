package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int x=1;
	    int y=1;
        System.out.println(x==y);

        Scanner scanner=new Scanner(System.in);
        int temperature= scanner.nextInt();
        boolean isWarm=temperature>20 && temperature<30;
        System.out.println(isWarm);


        boolean hasHighIncome=true;
        boolean hasGoodCredit=true;
        boolean hasCriminalRecords=false;
        boolean isEligible=(hasHighIncome || hasGoodCredit) && !hasCriminalRecords;
        System.out.println(isEligible);
    }
}
