import java.util.Random;
import java.util.Scanner;
public class GuesstheSecretNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //This will give us different inputs from the user that will tell the use to inter random numbers between 1 and 100
        Random random = new Random();
        String playAgain;
        int from = 1;
        int to = 10;
        int randomNumber = random.nextInt(to - from + 1) + from;
        int guessedNumber = 0;



        System.out.printf("The number is between %d and %d.\n", from, to);


        do {
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber)
                System.out.println("Your guess is too high!");
            else if (guessedNumber < randomNumber)
                System.out.println("Your guess is too low,try again?");


            else
                System.out.println("You got it!");


        } while (guessedNumber != randomNumber);
        {
        System.out.println("Congratulations, You guessed the number!");
        System.out.println("Would you like to play again? Enter Y to play or N key to quit: ");
        playAgain = scan.nextLine();
        if (playAgain == "Y" || playAgain == "y") {
            System.out.println("Enter a number between 1 and 10 as your first guess: ");
            guessedNumber = random.nextInt();

        }
    }
}}