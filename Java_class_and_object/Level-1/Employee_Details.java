package Java_class_objects;

class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

}

public class Employee_Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Employee emp = new Employee();
	        emp.name = "Yanshi";
	        emp.id = 101;
	        emp.salary = 50000;
	        emp.displayDetails();

	}

}
