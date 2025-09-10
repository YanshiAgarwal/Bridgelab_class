package Strings_problem;
import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String result = "";

        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversed = "";

            // reverse each word
            for (int j = word.length() - 1; j >= 0; j--) {
                reversed += word.charAt(j);
            }

            result += reversed + " "; 
        }
        System.out.print(result);

	}

}
