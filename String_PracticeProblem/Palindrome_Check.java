package Strings_problem;

import java.util.*;

public class Palindrome_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length()-1;
		int st = 0;
		while(st<=len) {
			if(str.charAt(st)!= str.charAt(len)) {
				System.out.println("False");
				return;
			}
			st++;
			len--;
		}
		System.out.println("True");

	}

}
