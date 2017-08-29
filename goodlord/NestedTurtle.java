
/**
 * oh my lord. nested loops.
 */
import java.awt.*;
import galapagos.*;
public class NestedTurtle
{
    public static void main(String[] args)
    {
        Turtle kms = new Turtle();
        kms.jumpTo(0,-100);
        kms.speed(10000);
        kms.penSize(3);     
        
        for(int i = 0; i < 360; i++)
        {
            kms.forward(2);
            kms.turn(1);
            for(int j = 0; j < 20; j++)
            {
                kms.forward(13);
                kms.turn(18);
            }
        }
        kms.hide();
    }
}
