package Assign2;

public class static_demo {
    static int count;
    static{
        count =100;
        System.out.println("Static block executed. Count initialized ");
    }
    public static void main(String[] args) {
        System.out.println(count);
    }
}
