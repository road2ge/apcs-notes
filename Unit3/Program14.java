
/**
 * Rock-Paper-Scissors simulation.
 *
 * @author Kale Miller
 * @version 31 October 2017
 */
import java.util.*;
public class Program14
{
    public static void main(String[] args) {
        int random;
        int tie = 0;
        int win = 0;
        int loss = 0;
        random = (int)(Math.random()*3);
        int input = -1;
        Scanner scan = new Scanner(System.in);
        System.out.println("input 0 for rock, 1 for paper, 2 for scissors, anything else to quit");
        while(input>=0 && input<3){
            random = (int)(Math.random()*3);
            input = scan.nextInt();

        if(input == 0) {
            if(random == 0){
                System.out.println("tie, computer chose rock");
                tie++;}
            else if(random == 1){
                System.out.println("lose, computer chose paper");loss++;}
            else{
                System.out.println("win, computer chose scissors");win++;}
        }
        else if(input == 1) {
            if(random == 0){
                System.out.println("win, computer chose rock");win++;}
            else if(random == 1){
                System.out.println("tie, computer chose paper");tie++;}
            else{
                System.out.println("lose, computer chose scissors");loss++;}
        }
        else if(input == 2){
            if(random == 0){
                System.out.println("lose, computer chose rock");loss++;}
            else if (random == 1){
                System.out.println("win, computer chose paper");win++;}
            else{
                System.out.println("tie, computer chose scissors");tie++;}
     
                }
        }
            System.out.println(win + " wins, " + loss + " losses, and " + tie + " ties");
        
    }
}
