package Java_Methods;

import java.util.Scanner;

public class L1Problem1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Principal amount (INR): ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();
        
        float si = calc(principal, rate, time);
        System.out.println("The Simple Interest is " + si +
                           " for Principal " + principal +
                           ", Rate of Interest " + rate +
                           " and Time " + time);
        sc.close();
        
    }
    static float calc(double principal, double rate, double time) {
        double result = (principal * rate * time) / 100;
        return (float) result;
        
    }
    

}
