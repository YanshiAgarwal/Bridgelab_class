package Strings;
import java.util.*;
public class Str_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int count = 0;

        try {
            while (true) {
                str.charAt(count);  
                count++;
            }
        } 
        catch (Exception e) {
        	
        }
        System.out.println(count);

	}

}
