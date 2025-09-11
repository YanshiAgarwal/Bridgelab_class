package Built_in_function;
import java.util.Scanner;

public class Problem5 {

    // function to take input
    static String getInput(Scanner sc) {
        System.out.print("Enter a word or phrase: ");
        return sc.nextLine();
    }

    // function to check if string is palindrome
    static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase(); // remove spaces and ignore case
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // function to show result
    static void showResult(String input, boolean result) {
        if (result) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = getInput(sc);
        boolean check = isPalindrome(text);
        showResult(text, check);

    }
}

