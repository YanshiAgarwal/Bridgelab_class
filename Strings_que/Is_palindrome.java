package Strings;
import java.util.*;
public class Is_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int st =0;
		int len = str.length()-1;
		while(st<=len) {
			if(str.charAt(st) != str.charAt(len)) {
				System.out.println("false");
				return;
			}
			st++;
			len--;
		}
		System.out.println("true");

	}

}
