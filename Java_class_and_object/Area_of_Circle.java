package Java_class_objects;

class Circle {
    double radius;

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
    }

}

public class Area_of_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method
		        Circle c = new Circle();
		        c.radius = 5;
		        c.display();
	}
}
