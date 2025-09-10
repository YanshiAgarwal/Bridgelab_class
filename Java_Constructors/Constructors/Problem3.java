package Java_Constructors;

class Person{
	String name;
	int age;
	Person(){
		this.name = "Unknown";
		this.age = 20;
	}
	Person(String name, int age){
		this.name = name;
		this.age =age;
		
	}
	Person(Person var){
		this.name = var.name;
		this.age = var.age;
	}
	void displayOrderDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
public class Problem3 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.displayOrderDetails();
		Person p2 = new Person("Anamika", 19);
		p2.displayOrderDetails();
		Person p3 = new Person(p2);
		p3.displayOrderDetails();

	}

}

