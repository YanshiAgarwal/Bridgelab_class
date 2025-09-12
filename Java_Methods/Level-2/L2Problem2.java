package Java_Methods;

import java.util.Scanner;

public class L2Problem2 {

    //check leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year >= 1582) {
            if (isLeapYear(year)) {
                System.out.println("The Year " + year + " is a Leap Year.");
            } else {
                System.out.println("The Year " + year + " is NOT a Leap Year.");
            }
        } else {
            System.out.println("Leap year check works only for year >= 1582 (Gregorian Calendar).");
        }

        sc.close();
    }
}
