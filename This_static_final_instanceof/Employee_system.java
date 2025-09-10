package This_static_final_instanceof;

class Employee {
    static String companyName = "Tech Solutions";   
    static int totalEmployees = 0;                  
    
    String name;
    String designation;
    final int id;    


    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;   
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void showDetails() {
    
        if (this instanceof Employee) {
            System.out.println("ID: " + id + " , Name: " + name + " , Designation: " + designation + " , Company: " + companyName);
        }
    }
}

public class Employee_system {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul", 101, "Developer");
        Employee e2 = new Employee("Ananya", 102, "Tester");
        Employee e3 = new Employee("Sneha", 103, "HR");

        e1.showDetails();
        e2.showDetails();
        e3.showDetails();

        Employee.displayTotalEmployees();
    }
}


