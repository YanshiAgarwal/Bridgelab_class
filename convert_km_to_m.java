import java.util.*;
public class convert_km_to_m {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double m = km * 0.621371;
        System.out.println("Distance in miles: " + m);

    }
}