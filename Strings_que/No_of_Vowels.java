package Strings;
import java.util.*;
public class No_of_Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		int count =0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch =='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
		}
		System.out.println(count);
	}

}
