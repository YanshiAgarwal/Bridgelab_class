package Strings_problem;

import java.util.Scanner;
public class Find_Longest_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);

	}

}
