package Strings;
import java.util.*;
public class ToggleCase {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		String str = sc.next();
		String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                // Convert uppercase → lowercase
                result += (char)(ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase → uppercase
                result += (char)(ch - 32);
            } else {
                // Keep non-alphabetic characters unchanged
                result += ch;
            }
        }

        System.out.println(result);
		
		
	}

}
