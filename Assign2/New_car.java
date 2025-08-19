package Assign2;

public class New_car {
    static int totalCars = 0;
    String model;

    New_car(String model) {
        this.model = model;
        totalCars++;
    }
    void showCarInfo() {
        System.out.println("Model: " + model + ", Total Cars: " + totalCars);
    }

    public static void main(String[] args) {
        New_car car1 = new New_car("Defender");
        New_car car2 = new New_car("Harrier");
        car2.showCarInfo(); 
        System.out.println("Access via class: Total Cars = " + New_car.totalCars);
        New_car.totalCars = 10; 
        System.out.println("Modified via car1: Total Cars = " + New_car.totalCars);
        System.out.println("Access via car2: Total Cars = " + car2.totalCars);
    }

    
}
