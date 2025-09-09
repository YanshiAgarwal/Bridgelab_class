package Strings;
import java.util.*;

public class Remove_all_digits {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with digits: ");
        String input = sc.nextLine();

        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!(ch >= '0' && ch <= '9')) {
                result += ch;
            }
        }

        System.out.println(result);
    }
}

