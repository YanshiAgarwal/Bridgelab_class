package Java_Constructors;

class Circle{
	int radius;
	Circle(){
		radius = 5;
	}
	Circle(int radius){
		this.radius = radius;
	}
}
public class Problem2 {

	public static void main(String[] args) {
		Circle radius1 = new Circle();
		Circle radius2 = new Circle(7);
		System.out.println(radius1.radius);
		System.out.println(radius2.radius);
	}

}

