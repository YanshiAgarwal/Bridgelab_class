package Strings_problem;

import java.util.Scanner;

public class No_of_Vowels_Consonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		int vowel = 0;
		int consonant = 0;
		for(int i =0; i<str.length();i++) {
			if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i'|| str.charAt(i) == 'o'|| str.charAt(i) == 'u') {
				vowel++;
			}
			else {
				consonant++;
			}
		}
		System.out.println("No of Vowels and consonant respectively are " + vowel +" "+ consonant);

	}

}
