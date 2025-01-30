package com.GAmes;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] options = {"Rock", "Paper", "Scissors"};
        Random random = new Random();

        while (true) {
            System.out.println("Enter Rock, Paper, or Scissors (or Exit to quit): ");
            String userChoice = scanner.nextLine();
            if (userChoice.equalsIgnoreCase("Exit")) {
                break;
            }

            String computerChoice = options[random.nextInt(options.length)];
            System.out.println("Computer chose: " + computerChoice);

            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                    (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                    (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }
        scanner.close();
    }
}

