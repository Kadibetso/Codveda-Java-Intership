/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguessinggame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kadyk
 */
public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random rand = new Random();
        int computerGuess = rand.nextInt(10) + 1;
        int attempts = 0;

        while (attempts < 3) {
            System.out.println("Enter your number between 1 and 10");
            int userGuess = kb.nextInt();
            if (userGuess >= 1 && userGuess <= 10) {

                attempts++;
                if (computerGuess == userGuess) {
                    System.out.println("You guessed right!!!");
                    break;
                } else if (userGuess < computerGuess) {
                    System.out.println("Too low!!!");
                } else {
                    System.out.println("Too high!!!");
                }
            }
            else{
                System.out.println("ivalid input!!! number must be between 1 and 10");
            }
        }

        if (attempts == 3) {
            System.out.println("Too many attemps");
            System.out.println("The computer guess was  " + computerGuess);

        }

    }
}
