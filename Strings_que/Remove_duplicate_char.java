package Strings;
import java.util.*;
public class Remove_duplicate_char {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        String str = sc.nextLine().toLowerCase();
		        
		        repeatingchar(str, 0, new StringBuilder(""), new boolean[26]);
		        }
	
	public static void repeatingchar(String str, int idx, StringBuilder sb, boolean[] map) {
		        if (idx == str.length()) {
		            System.out.println(sb.toString());
		            return;
		        }

		        char currchar = str.charAt(idx);

		        if (!map[currchar - 'a']) {   
		            sb.append(currchar);    
		            map[currchar - 'a'] = true; 
		        }

		        repeatingchar(str, idx + 1, sb, map);
			}
}
