
/**
 * Write a description of class Program10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Program10
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = (int)Math.random()*100+ 1;
        int exit = 1;
        int guesses = 0;
        int guess;
        while(exit > 0) {
            System.out.println("Guess a number, 1-100 inclusive. Enter anything less than 1 to exit.");
            guess = scan.nextInt();
            guesses++;
            if(guess < num) 
                System.out.println("Nope, guess higher!");
            else if(guess > num)
                System.out.println("Nope, guess lower!");
            else {
                System.out.println("Yep! the amount of guesses was " + guesses);
                System.out.println("Enter 1 to play again. Enter anything lower to exit");
                exit = scan.nextInt();
            }
        }
    }
}
