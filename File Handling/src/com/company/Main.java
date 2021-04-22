package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    try{
	        File myObj =new File("D:\\Filef1.txt");
	        if(myObj.createNewFile()){
                System.out.println("File created: "+myObj.getName());
            } else {
                System.out.println("File already exists");
            }

	        FileWriter myWriter=new FileWriter("D:\\Filef1.txt");
	        myWriter.write("Java is very good programming language");
	        myWriter.close();
            System.out.println("Successfully wrote the file.");

            Scanner myReader =new Scanner(myObj);
            while(myReader.hasNextLine()){
                String data =myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
