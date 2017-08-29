/* very few classes have made me
 * more frustrated than this.
 */
import galapagos.*;
public class UpstairsTurtle {
    public static void main(String[] args) {
        Turtle kms = new Turtle();
        kms.speed(1000000);
        kms.hide();
        int length = 20;
        for(int i = 0; i < 5; i++) {
            kms.heading(90);
            kms.forward(length);
            kms.turn(-90);
            kms.forward(length);
        }
    }
}