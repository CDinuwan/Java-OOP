package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbers =new int[]{1,2,3,4,5};
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        Arrays.sort(numbers);

        //multidimentional array

        int [][]numbers1=new int[2][3];
        numbers1[0][0]=1;
        numbers1[1][0]=2;
        System.out.println(Arrays.deepToString(numbers1));

    }
}
