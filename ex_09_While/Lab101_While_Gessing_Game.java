package ex_09_While;

import java.util.Random;
import java.util.Scanner;

public class Lab101_While_Gessing_Game {
    public static void main(String[] args) {
        //Guess a number between 1 and 100
        // n = 56
        // 90, 60,  50 - > 50 to 60

        Random random = new Random();
        int numberToGuess = random.nextInt(100);
        System.out.println(numberToGuess);

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempts = 0;

        while (true){
            if(!scanner.hasNext()){
                System.out.println("Invalid input please enter name");
                scanner.hasNext();
                continue;
            }
            guess =  scanner.nextInt();
            attempts++;

            if(guess < 1 || guess > 100){
                System.out.println("please enter the number between 1 and 100");
            }

            if(guess < numberToGuess){
                System.out.println("Too low, try again");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, try again");
            }else{
                System.out.println("Correct! you guessed it in" + attempts + "attempts");
                break;
            }
        }

    }
}
