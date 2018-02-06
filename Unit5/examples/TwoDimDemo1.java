
/**
 * Creates a 2d array using an initalizer list, prints it, and changes it.
 * 
 * @author Cliff B.
 * @version 1/24/2018
 */
public class TwoDimDemo1
{
    public static void main(String[] args)
    {
        //instanciates array using an initilizer list
        int[] [] id = { {27, 32, 38, 41, 51, 33},
                        {17, 65, 89, 91, 45, 51},
                        {82, 33, 10, 18, 37, 42},
                        {67, 99, 84, 12, 77, 83},
                        {95, 56, 72, 42, 81, 11}};
                
        //prints 2D array using for-loops
        for(int row=0; row < id.length; row++)
        {
            for(int col=0; col < id[row].length; col++)
            {
                System.out.print(id[row][col] + "\t");
            }
            System.out.println();
        }
        
        //changes the second occurence of 51 to 52
        
        id[1][5] = 52;
        
        //changes the second occurence of 33 to 34
        
        id[2][1] = 34;
        

        
        //prints corrected array
        for(int row=0; row < id.length; row++)
        {
            System.out.println();
            for(int col=0; col < id[row].length; col++)
            {
                System.out.print(id[row][col] + "\t");
            }
        }
        
    }
}
