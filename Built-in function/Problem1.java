package Built_in_function;

import java.util.Random;
import java.util.Scanner;

public class Problem1 {

    // makes a guess between given range
    static int makeGuess(int low, int high) {
        Random r = new Random();
        return r.nextInt(high - low + 1) + low;
    }

    // ask user if guess is high, low or correct
    static String askFeedback(Scanner sc, int guess) {
        System.out.print("Is your number " + guess + "? (high/low/correct): ");
        return sc.next().toLowerCase();
    }

    // main logic
    static void startGame() {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        boolean found = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while (!found && low <= high) {
            int guess = makeGuess(low, high);
            String reply = askFeedback(sc, guess);

            if (reply.equals("low")) {
                low = guess + 1;
            } else if (reply.equals("high")) {
                high = guess - 1;
            } else if (reply.equals("correct")) {
                System.out.println("I got it! The number is " + guess);
                found = true;
            } else {
                System.out.println("Please type only: high / low / correct");
            }
        }

        if (!found) {
            System.out.println("Game ended. Maybe wrong inputs were given.");
        }

    }

    public static void main(String[] args) {
        startGame();
    }
}


