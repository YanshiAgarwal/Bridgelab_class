package Modifiers;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    void display() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name +
                           ", CGPA: " + getCGPA() + ", Specialization: " + specialization);
    }
}

public class University_Management {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostgraduateStudent pg = new PostgraduateStudent(101, "Yanshi", 8.9, "Computer Science");

        // Display details
        pg.display();

        // Update CGPA using setter
        pg.setCGPA(9.2);

        System.out.println("\nAfter updating CGPA:");
        pg.display();

	}

}
