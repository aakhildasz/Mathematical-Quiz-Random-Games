package src.main.java;

import java.util.Scanner;

public class GuessGame {
    public static void Start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Congratulations! You have been randomly assigned the game 'Guess the Magic Number' to play. Have fun!");
        System.out.println("Welcome to the Guess the Magic Number!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
 
        int randnumber = (int)(Math.random() * 100) + 1;
        int guess;

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess <randnumber) {
                System.out.println("Too low! Try again.");
            } else if (guess >randnumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the magic number: " + randnumber);
                System.out.println("Thanks for playing! We hope you had fun and enjoyed the experience.");
            }
        } while (guess != randnumber);

        sc.close();
    }
}

