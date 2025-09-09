package Strings;
import java.util.*;
public class Compress_str {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder sb = new StringBuilder("");
		
		for(int i=0;i<str.length();i++) {
			int count=1;
			
			while(i+1<str.length() && str.charAt(i)==str.charAt(i+1)) {
				count++;
				i++;
			}
			
			sb.append(str.charAt(i));
			
			if(count>1) {
				sb.append(count);
			}
		}
		System.out.print(sb);	
	}

}
