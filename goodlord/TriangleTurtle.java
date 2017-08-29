/* this is really complicated code.
 * i hope i can do it.
 */
import galapagos.*;
public class TriangleTurtle{
    public static void main(String[] args){
        Turtle kms = new Turtle();
        kms.speed(1000000);
        kms.hide();
        for(int i = 0; i < 3; i++){
            kms.forward(80);
            kms.turn(120);
        }
    }
}