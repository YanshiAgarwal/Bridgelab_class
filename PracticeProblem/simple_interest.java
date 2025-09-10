import java.util.*;
public class simple_interest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest" + interest);

    }
}
