package Assign2;

public class car {
    String model;
    int year;

    public car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {
        car c1 = new car("Toyota", 2020);
        car c2 = new car("Honda", 2021);
        System.out.println("Car 1: " + c1.model + ", Year: " + c1.year);
        System.out.println("Car 2: " + c2.model + ", Year: " + c2.year);
    }


    
}
