package Built_in_function;
import java.util.Scanner;

public class Problem2 {

    // function to take input
    static int getNumber(Scanner sc, String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

    // function to calculate maximum of three
    static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = getNumber(sc, "Enter first number: ");
        int num2 = getNumber(sc, "Enter second number: ");
        int num3 = getNumber(sc, "Enter third number: ");

        int maximum = findMax(num1, num2, num3);

        System.out.println("The maximum of the three numbers is: " + maximum);

    }
}
