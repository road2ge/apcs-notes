
/**
 * omfg i hate this alot now
 */
import galapagos.*;
import java.awt.*;
public class FaceTurtle
{
    public static void main(String[] args)
    {
        Turtle kms = new Turtle();
        kms.hide();
        kms.speed(1000);
        kms.penColor(Color.RED);
        for(int i = 0; i < 40; i++)
        {
            kms.forward(8);
            kms.turn(9);
        }
        kms.jumpTo(20,70);
        for(int i = 0; i < 10; i++)
        {
            kms.forward(4);
            kms.turn(36);
        }
        kms.jumpTo(-20,70);
        for(int i = 0; i < 10; i++)
        {
            kms.forward(4);
            kms.turn(36);
        }
        kms.jumpTo(-10,25);
        kms.heading(-89);
        for(int i = 0; i < 10; i++)
        {
            kms.forward(4);
            kms.turn(19);
        }
    }
}
