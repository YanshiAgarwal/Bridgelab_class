package Strings;
import java.util.*;
public class StringEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		int a = str1.length();
		int b = str2.length();
		
		boolean result = isequal(str1,str2,a,b);
		System.out.println(result);
		
		//case sensitive
//		if(str1.equals(str2)) {
//			System.out.println("yes");
//		}
//		else {
//			System.out.println("no");
//		}
//		
//		//case insensitive 
//		if(str1.equalsIgnoreCase(str2)) {
//			System.out.println("yes");
//		}
//		else {
//			System.out.println("no");
//		}
		
		
	}
	public static boolean isequal(String str1, String str2, int a, int b) {
		if(a!=b) {
			return false;
		}
		for(int i=0; i<a; i++) {
			if(str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}
