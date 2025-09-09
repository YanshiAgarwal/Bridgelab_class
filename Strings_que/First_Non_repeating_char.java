package Strings;
import java.util.*;
public class First_Non_repeating_char {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char res = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			int count =0;
			
			//check occurence
			for(int j=0; j< str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (count == 1) {
                res = ch ;
                break; 
            }
		}
		if (res != 0) {
            System.out.println("First non-repeating character: " + res);
        } 
		else {
            System.out.println("No non-repeating character found.");
        }

	}

}
