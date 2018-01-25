
/**
 * Review and creates an array of string objects for a fortune teller
 * 
 * @author  Cliff B.
 * @version 1/16/18
 */

import java.util.*;
public class FortuneTeller
{
    public static void main(String[] args)
    {
        String[] fortune = new String[5];
        
        fortune[0] = "Bad luck is coming your way.";
        fortune[1] = "You'll find love soon.";
        fortune[2] = "You will make an A on your next AP test";
        fortune[3] = "";
        fortune[4] = "You will fall at your graduation.";
           
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Would yo like your fortune read? (yes or no) ");
        String ans = scan.nextLine();
        
        while(ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yea") || ans.equalsIgnoreCase("yup"))
        {
            int random = (int)(Math.random()*fortune.length);
            
            System.out.println("\n"+fortune[random]);
            
            System.out.println("Would yo like your fortune read? (yes or no) ");
            ans = scan.nextLine();
        }

    }
}
