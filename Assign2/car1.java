package Assign2;

public class car1 {
    String model;
    int year;
    static int no_of_cars =0;

    public car1(String model, int year) {
        this.model = model;
        this.year = year;
        no_of_cars++; 
    }

    public static void main(String[] args) {
        car1 c1 = new car1("Toyota", 2020);
        car1 c2 = new car1("Honda", 2021);
        System.out.println("Car 1: " + c1.model + ", Year: " + c1.year);
        System.out.println("Car 2: " + c2.model + ", Year: " + c2.year);
        System.out.println("Total number of cars created: " + car1.no_of_cars);
    }


    
}
