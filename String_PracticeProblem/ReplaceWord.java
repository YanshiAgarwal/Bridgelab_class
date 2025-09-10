package Strings_problem;

import java.util.Scanner;

public class ReplaceWord {
    
    // method to replace word
    static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        String result = "";

        for (String w : words) {
            if (w.equals(oldWord)) {
                result += newWord + " ";
            } else {
                result += w + " ";
            }
        }
        return result.trim();  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        System.out.println("Enter word to replace:");
        String oldWord = sc.nextLine();

        System.out.println("Enter new word:");
        String newWord = sc.nextLine();

        String updated = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified Sentence: " + updated);

        sc.close();
    }
}

