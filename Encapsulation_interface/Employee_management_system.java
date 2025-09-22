package Encapsulation_interface;

public class Employee_management_system {
	abstract static class Employee {
        private String employeeId;
        private String name;
        private double baseSalary;
        private int hours;
        public Employee(String employeeId, String name, double baseSalary) {
            this.employeeId = employeeId;
            this.name = name;
            this.baseSalary = baseSalary;
        }
        public String getEmployeeId() { 
        	return employeeId; 
        }
        public String getName() { 
        	return name;
        }
        public double getBaseSalary() { 
        	return baseSalary;
        }
        public int getHours() { 
        	return hours; 
        }

        public void setHours(int hours) { 
            this.hours = hours; 
            }
        public void setBaseSalary(double baseSalary) {
        	this.baseSalary = baseSalary; 
        }
        public abstract void calculateSalary();
        public void displayDetails() {
            System.out.println("EmployeeId: " + employeeId);
            System.out.println("Name: " + name);
            System.out.println("BaseSalary: " + baseSalary);
        }
    }
    interface Department {
        void assignDepartment(String dept);
        void getDepartmentDetails();
    }
    static class FullTimeEmployee extends Employee implements Department {
        private String department;

        public FullTimeEmployee(String employeeId, String name, double baseSalary) {
            super(employeeId, name, baseSalary);
        }

        @Override
        public void calculateSalary() {
            System.out.println("Salary of FullTimeEmployee is: " + (getBaseSalary() * getHours()));
        }

        @Override
        public void assignDepartment(String dept) {
            this.department = dept;
        }

        @Override
        public void getDepartmentDetails() {
            System.out.println("Department: " + department);
        }
    }
    static class PartTimeEmployee extends Employee implements Department {
        private String department;

        public PartTimeEmployee(String employeeId, String name, double baseSalary) {
            super(employeeId, name, baseSalary);
        }

        @Override
        public void calculateSalary() {
            System.out.println("Salary of PartTimeEmployee is: " + (getBaseSalary() * getHours()));
        }

        @Override
        public void assignDepartment(String dept) {
            this.department = dept;
        }

        @Override
        public void getDepartmentDetails() {
            System.out.println("Department: " + department);
        }
    }
    public static void main(String[] args) {
        FullTimeEmployee e1 = new FullTimeEmployee("1", "A", 50000); 
        e1.setHours(8); 
        e1.assignDepartment("IT");
        e1.displayDetails();
        e1.getDepartmentDetails();
        e1.calculateSalary();
        
        System.out.println("");
        
        PartTimeEmployee e2 = new PartTimeEmployee("2", "B", 200);
        e2.setHours(5);
        e2.assignDepartment("HR");
        e2.displayDetails();
        e2.getDepartmentDetails();
        e2.calculateSalary();
    }

	

}
