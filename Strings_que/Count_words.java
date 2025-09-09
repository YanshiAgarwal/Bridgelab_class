package Strings;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Count_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		int count = st.countTokens();
		
		System.out.println(count);
		
	}

}
