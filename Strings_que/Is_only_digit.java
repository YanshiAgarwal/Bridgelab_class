package Strings;
import java.util.*;
public class Is_only_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String result ="";
        for(int i=0; i<input.length(); i++) {
        	char ch = input.charAt(i);
        	if(!(ch >= '0' && ch <= '9')) {
        		System.out.println(false);
        		return;
        	}
        	
        }
        System.out.println(true);
	}

}
