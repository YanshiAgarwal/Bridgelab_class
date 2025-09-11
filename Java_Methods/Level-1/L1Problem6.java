package Java_Methods;
import java.util.Scanner;

public class L1Problem6 {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();

        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero!");
        } else {
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            System.out.println("Each child will get " + result[0] + 
                               " chocolates and the remaining chocolates are " + result[1]);
        }

        sc.close();
    }
}

