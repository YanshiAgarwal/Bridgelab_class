package Java_Methods;

import java.util.Scanner;

public class L2Problem1 {

    //find sum using recursion
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    //find sum using formula
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            int sum1 = recursiveSum(n);
            int sum2 = formulaSum(n);

            System.out.println("Sum using Recursion = " + sum1);
            System.out.println("Sum using Formula   = " + sum2);

            if (sum1 == sum2) {
                System.out.println("Both results are same, so the calculation is correct!");
            }
        }
        sc.close();
    }
}

