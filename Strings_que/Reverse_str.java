package Strings;
import java.util.*;
public class Reverse_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String result = "";

        String[] words = str.split(" ");  // split sentence into words

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversed = "";

            // reverse each word
            for (int j = word.length() - 1; j >= 0; j--) {
                reversed += word.charAt(j);
            }

            result += reversed + " ";  // add reversed word + space
        }

        System.out.println(result.trim());

	}

}
