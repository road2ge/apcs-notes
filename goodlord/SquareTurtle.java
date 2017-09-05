/**
 * This is legitmitately the third time I have interacted with turtles. Once in JS, once in Python,
 * now in Java...
 * Kale Miller, 22 August, 2017
 */

//allow creation of turtles and turtle methods
import galapagos.*;

//oh boy more .* imports
import java.awt.*;

public class SquareTurtle 
{
    //main method
    public static void main(String[] args) 
    {
        //default turtle object.
        Turtle squareTurtle = new Turtle();
        //change colors
        squareTurtle.bodyColor(Color.RED);
        squareTurtle.penColor(Color.RED);
        squareTurtle.penSize(5);
        
        //good lord the turlte speed is so slow.
        squareTurtle.speed(1000);
        
        //I wonder if I can hide squareTurtle and it still draw
        squareTurtle.hide();
        
        squareTurtle.forward(40);
        squareTurtle.turn(90);
        squareTurtle.forward(40);
        squareTurtle.turn(90);
        squareTurtle.forward(40);
        squareTurtle.turn(90);
        squareTurtle.forward(40);
        squareTurtle.turn(90);
        
    }
}