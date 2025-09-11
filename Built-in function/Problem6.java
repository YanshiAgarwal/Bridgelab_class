package Built_in_function;
import java.util.Scanner;

public class Problem6 {

    // function to take input
    static int getInput(Scanner sc) {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    // recursive function to calculate factorial
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // base case
        }
        return n * factorial(n - 1); // recursive call
    }

    static void showResult(int num, int fact) {
        System.out.println("Factorial of " + num + " is: " + fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = getInput(sc);
        int result = factorial(num);
        showResult(num, result);

    }
}
