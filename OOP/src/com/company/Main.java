package com.company;

class Car{

    //Abstract classes
    //Interfaces
    public Car(int seats,int doors){
       this.seats=seats;
       this.doors=doors;
    }
    String color="Black";
    int seats=4;
    int doors=2;

    void Drive(){
        System.out.println("Car is Driving");
    }
    void Drive(String man){
        System.out.println("Car is driving by "+man);
    }
}
interface Wheel{
    public abstract void wheel();
    public static final int a=10;
}
class Van extends Car implements Wheel{

    public Van(int seats, int doors) {
        super(seats, doors);
    }
    public void wheel(){
        System.out.println("Hi wheel");
    }
    @Override
    void Drive() {
        System.out.println("Driving a van");
    }
}
public class Main {

    public static void main(String[] args) {
	    Car car=new Car(5,6);
        System.out.println("Seats : "+car.seats);
        car.Drive();
        car.Drive("Chanuka");
        Van van=new Van(2,6);
        van.Drive();

        Car car1=new Van(12,14);//Upcasting
    }
}
