/**
 * This is legitmitately the third time I have interacted with turtles. Once in JS, once in Python,
 * now in Java...
 * Kale Miller, 22 August, 2017
 */

//allow creation of turtles and turtle methods
import galapagos.*;

//oh boy more .* imports
import java.awt.*;

public class NameTurtle 
{
    //main method
    public static void main(String[] args) 
    {
        //default turtle object.
        Turtle nameTurtle = new Turtle();
        //change colors
        nameTurtle.bodyColor(Color.RED);
        nameTurtle.penColor(Color.RED);
        nameTurtle.penSize(5);
        
        //good lord the turlte speed is so slow.
        nameTurtle.speed(1000);
        
        //I wonder if I can hide nameTurtle and it still draw
        nameTurtle.hide();
        
        nameTurtle.heading(270);
        nameTurtle.forward(40);
        nameTurtle.turn(90);
        nameTurtle.forward(15);
        
        nameTurtle.penUp();
        nameTurtle.forward(10);
        
        nameTurtle.penColor(Color.BLUE);
        nameTurtle.penDown();
        nameTurtle.forward(15);
        nameTurtle.turn(90);
        nameTurtle.forward(40);
        nameTurtle.turn(90);
        nameTurtle.forward(15);
        nameTurtle.turn(90);
        nameTurtle.forward(40);
        nameTurtle.turn(90);
        nameTurtle.penUp();
        
        nameTurtle.forward(25);
        nameTurtle.penDown();
        nameTurtle.turn(90);
        nameTurtle.penColor(Color.MAGENTA);
        nameTurtle.heading(90);
        nameTurtle.forward(40);
        nameTurtle.turn(180);
        nameTurtle.forward(40);
        nameTurtle.heading(0);
        nameTurtle.forward(15);
    }
}