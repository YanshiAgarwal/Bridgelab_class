package Date_and_Time;

import java.time.*;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Data_Arithmetic {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a date (dd-MM-yyyy): ");
		String input = sc.nextLine();
	 	
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(input, formatter);
		System.out.println("Original Date: " + date.format(formatter));
		
		LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After adding 7 days, 1 month, and 2 years: " + modifiedDate.format(formatter));

        LocalDate finalDate = modifiedDate.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + finalDate.format(formatter));
		

	}

}
