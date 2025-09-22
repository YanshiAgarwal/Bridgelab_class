package Java_Control_Flow;

import java.util.Scanner;

public class Divisiblity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean result = false;
		if(n % 5 == 0) {
			result = true;
		}
		System.out.println("Is the number "+ n +" is divisible by 5 ? " + result);

	}

}
