package Strings_problem;

import java.util.Scanner;

public class Most_FrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int[] freq = new int[256];  // ASCII size
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char mostFreq = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (freq[str.charAt(i)] > freq[mostFreq]) {
                mostFreq = str.charAt(i);
            }
        }

        System.out.println("Most Frequent Character: '" + mostFreq + "'");
    }
}
