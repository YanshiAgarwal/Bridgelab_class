package Assign2;

public class final_var {

    int salary;
    static final String company="Google";

    public final_var(int salary){
        this.salary=salary;
    }
    public static void main(String[] args) {
        int salary=500000;
        company ="Flipkart";
        System.out.println(salary);
        final_var d1 =new final_var(790000);
        System.out.println(d1.salary);
    }
}
//commit Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        //The final field final_var.company cannot be assigned

