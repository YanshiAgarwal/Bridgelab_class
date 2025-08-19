package Assign2;

public class student {
    String name;
    int marks;

    public student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public static void main(String[] args) {
        student s1 = new student("Alice", 85);
        student s2 = new student("Bob", 90);
        System.out.println("Student 1: " + s1.name + ", Marks: " + s1.marks);
        System.out.println("Student 2: " + s2.name + ", Marks: " + s2.marks);
    }
}
