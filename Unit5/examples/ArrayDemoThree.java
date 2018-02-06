
/**
 * Instanciates an array using an initilizer list
 * 
 * @author Cliff B.
 * @version 1-11-18
 */
public class ArrayDemoThree
{
    public static void main(String[] args)
    {
        double[] speeds = {21.8, 55, 36.9, 25.8, 37.6, 15.1, 20.9};
        
        double sum = 0;
        
        for(int i = 0; i < speeds.length; i++)
        {
            sum += speeds[i];
        }
        
        double average = sum/speeds.length;
        
        average = (int)(average * 1000 +.5)/1000.0;
        
        System.out.println("The average of these "+ speeds.length +" numbers is: "+average+".");
    }
}
