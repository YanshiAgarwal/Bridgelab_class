package Strings;
import java.util.Scanner;
public class Replace_space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder("");
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') {
				sb.append("_");
			}
			else {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb);
	}

}
