/* challenge incoming boys
 * 
 */
import galapagos.*;
public class HexagonTurtle {
    public static void main(String[] args){
        Turtle kms = new Turtle();
        kms.speed(100000);
        kms.hide();
        for(int i = 0; i < 6; i++){
            kms.forward(50);
            kms.turn(60);
        }
    }
}