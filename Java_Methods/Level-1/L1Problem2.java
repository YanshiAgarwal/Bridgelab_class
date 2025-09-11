package Java_Methods;

import java.util.Scanner;

public class L1Problem2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        System.out.println("Total handshakes: " + fun(n));
        
        sc.close();
    }
    static int fun(int n) {
        int result = (n * (n - 1)) / 2;
        return result;

    }

}
