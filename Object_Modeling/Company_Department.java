package Object_Modeling;

import java.util.ArrayList;

class Employee {
    String name;
    String role;

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    void showEmployee() {
        System.out.println(" "+ name + " (" + role + ")");
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(String name, String role) {
        employees.add(new Employee(name, role));
    }

    void showDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.showEmployee();
        }
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showCompany() {
        System.out.println("\nCompany: " + companyName);
        for (Department d : departments) {
            d.showDepartment();
        }
    }

    // simulate deletion (all departments + employees go away)
    void closeCompany() {
        System.out.println("\nClosing company: " + companyName);
        departments.clear();
    }
}

public class Company_Department {
	public static void main(String[] args) {
        Company c = new Company("Tech Solutions");

        Department d1 = new Department("IT");
        d1.addEmployee("Rahul", "Developer");
        d1.addEmployee("Ananya", "Tester");

        Department d2 = new Department("HR");
        d2.addEmployee("Sneha", "HR Manager");

        c.addDepartment(d1);
        c.addDepartment(d2);

        c.showCompany();

        // delete company → departments + employees removed
        c.closeCompany();
        c.showCompany(); 
    }

}
