class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "ABC Institute";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration +
                           " months, Fee: " + fee + ", Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

public class Online_course {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c1 = new Course("Java Programming", 3, 15000);
        Course c2 = new Course("Web Development", 6, 25000);
        // Display initial details
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        // Update institute name (affects all objects)
        Course.updateInstituteName("XYZ Training Center");
    
        System.out.println("\nAfter updating institute name:\n");
        // Display details again
        c1.displayCourseDetails();
        c2.displayCourseDetails();
	}
}
