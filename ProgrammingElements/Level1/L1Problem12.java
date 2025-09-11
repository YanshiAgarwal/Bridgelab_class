package ProgrammingElements;

import java.util.Scanner;

public class L1Problem12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double feet = sc.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("The distance in feet is " + feet +
                           ", in yards is " + yards +
                           " and in miles is " + miles);

        sc.close();
    }
}

