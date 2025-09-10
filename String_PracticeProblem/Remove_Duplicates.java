package Strings_problem;
import java.util.*;

public class Remove_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		boolean arr[] = new boolean[26];
		StringBuilder sb = new StringBuilder("");
		for(int i = 0; i < str.length() ; i++) {
			char cur_char = str.charAt(i);
			if(arr[cur_char - 'a'] == false && cur_char != ' ') {
				sb.append(cur_char);
				arr[cur_char - 'a'] = true;
			}
		}
		System.out.print(sb);

	}

}
