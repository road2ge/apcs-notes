
/**
 * Sometimes, I get really annoyed by the way this class works out.
 * It's just a lot of really annoying busy work and turtle has no relevance to CompSci
 * except for learning what objects and methods are etc...
 * 
 * Kale Miller, 2017
 */
import java.awt.*;
import galapagos.*;

public class HouseTurtle
{
    public static void main(String[] args)
    {
        Turtle houseTurtle = new Turtle();
        //change turtle settings
        houseTurtle.hide();
        houseTurtle.speed(1000);
        houseTurtle.penSize(5);
        houseTurtle.penColor(Color.RED);
        //make the front of the house
        for(int i = 0; i < 4; i++)
        {
            houseTurtle.forward(80);
            houseTurtle.turn(90);
        }
        //move houseTurtle to the top
        houseTurtle.jumpTo(0,80);
        //make a triangle with moveTo because I'm lazy.
        houseTurtle.moveTo(40,120);
        houseTurtle.moveTo(80,80);
        houseTurtle.jumpTo(30,0);
        houseTurtle.heading(90);
        houseTurtle.forward(30);houseTurtle.turn(-90);houseTurtle.forward(20);houseTurtle.turn(-90);houseTurtle.forward(30);
        
    }
}