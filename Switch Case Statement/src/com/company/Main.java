package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String role="admin";
        if(role=="admin"){
            System.out.println("you are admin");
        }
        else if(role=="moderator"){
            System.out.println("You are moderator");
        }
        else{
            System.out.println("You are something else");
        }

        switch (role){
            case "admin":
                System.out.println("You are an admin");
                break;

            case "moderator":
                System.out.println("You are a moderator");
                break;

            default:
                System.out.println("You are something else");
        }
    }
}
