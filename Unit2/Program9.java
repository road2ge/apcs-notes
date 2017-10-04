import java.util.*;
public class Program9
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type the radius of a sphere and press enter");
		double radius = scan.nextDouble();
		double volume = Math.pow(radius,3) * (4/3) * Math.PI;
		double sa = 4 * Math.PI * Math.pow(radius,2);
		System.out.println("The volume of a sphere with a radius " + radius + " is " + volume + ", and the" 
			+ " surface area is " + sa);
	}
}