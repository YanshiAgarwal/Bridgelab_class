package Assign2;

public class Demo {
    int salary;

    public Demo(int salary) {
        this.salary = salary;
    }   

    public static void main(String[] args) {
        int salary=500000;
        System.out.println(salary);
        Demo d1 =new Demo(790000);
        System.out.println(d1.salary);
    }
}
