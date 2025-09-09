package Java_class_objects;

class MobilePhone {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class Mobile_Phone_Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MobilePhone phone = new MobilePhone();
        phone.brand = "Samsung";
        phone.model = "Galaxy S23";
        phone.price = 70000;
        phone.displayDetails();

	}
}
