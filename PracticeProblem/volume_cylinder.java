import java.util.*;
public class volume_cylinder {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        int height = sc.nextInt();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of cylinder: " + volume);
    }
}
