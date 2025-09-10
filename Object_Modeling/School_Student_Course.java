package Object_Modeling;

import java.util.ArrayList;

class Course {
    String courseName;
    ArrayList<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(Student s) {
        if (!students.contains(s)) {
            students.add(s);
        }
    }

    void showStudents() {
        System.out.println("\nCourse: " + courseName + " has students:");
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enroll(Course c) {
        if (!courses.contains(c)) {
            courses.add(c);
            c.addStudent(this); 
        }
    }

    void showCourses() {
        System.out.println("\nStudent: " + name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println(c.courseName);
        }
    }
}

class School {
    String schoolName;
    ArrayList<Student> students = new ArrayList<>();

    School(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(Student s) {
        students.add(s);   
    }

    void showStudents() {
        System.out.println("School: " + schoolName + " has students:");
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}

public class School_Student_Course {
    public static void main(String[] args) {
        School school = new School("Green Valley School");

        Student s1 = new Student("Rahul");
        Student s2 = new Student("Ananya");
        Student s3 = new Student("Sneha");

        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");
        Course c3 = new Course("English");

        s1.enroll(c1);
        s1.enroll(c2);

        s2.enroll(c1);
        s2.enroll(c3);

        s3.enroll(c2);

        // Show details
        school.showStudents();

        s1.showCourses();
        s2.showCourses();
        s3.showCourses();

        c1.showStudents();
        c2.showStudents();
        c3.showStudents();
    }
}

