/**
 * This is legitmitately the third time I have interacted with turtles. Once in JS, once in Python,
 * now in Java...
 * Kale Miller, 22 August, 2017
 */

//allow creation of turtles and turtle methods
import galapagos.*;

//oh boy more .* imports
import java.awt.*;

public class StarTurtle 
{
    //main method
    public static void main(String[] args) 
    {
        //default turtle object.
        Turtle starTurtle = new Turtle();
        //change colors
        starTurtle.bodyColor(Color.RED);
        starTurtle.penColor(Color.RED);
        starTurtle.penSize(5);
        
        //good lord the turlte speed is so slow.
        starTurtle.speed(1000);
        
        //I wonder if I can hide starTurtle and it still draw
        starTurtle.hide();
        
        //first and most simple method makes starTurtle move forward
        int angle = 144;
        int size = 60;
        starTurtle.heading(60);
        starTurtle.forward(size);
        starTurtle.turn(angle);
        
        
        starTurtle.forward(size);
        starTurtle.turn(angle);
        
        
        starTurtle.forward(size);
        starTurtle.turn(angle);
        
        
        starTurtle.forward(size);
        starTurtle.turn(angle);
        
        
        starTurtle.forward(size);
        starTurtle.turn(angle);
    }
}