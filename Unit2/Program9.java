/**
 * Takes radius of sphere, prints SA and V
 *
 * @author Kale Miller
 * @version 10/4/17
 */
import java.util.*;
public class Program9
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type the radius of a sphere and press enter");
		int radius = scan.nextInt();
		double volume = (4 * Math.pow(radius, 3) * Math.PI) / 3;
		double sa = Math.pow(radius,2) * 4 * Math.PI;
		volume = (int)((volume * 10000) + .5);
		volume = volume / 10000;
		sa = (int)((sa*10000) + .5);
		sa = sa / 10000;
		System.out.println("The volume of a sphere with a radius " + radius + " is " + volume + ", and the surface area is " + sa);
	}
}