import java.util.*;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int expo = sc.nextInt();
        double power = Math.pow(base,expo);
        System.out.println(power);
    }
}