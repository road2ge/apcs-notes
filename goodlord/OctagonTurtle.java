/*
 * time2make stop sign ecks deeee
 */
import galapagos.*;
public class OctagonTurtle {
    public static void main(String[] args) {
        Turtle kms = new Turtle();
        kms.speed(1000000);
        kms.hide();
        for(int i = 0; i < 8; i++) {
            kms.forward(40);
            kms.turn(45);
        }
    }
}