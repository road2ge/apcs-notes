
/**
 * Writing 2 dimensional arrays with given values
 * 
 * @author Cliff B.
 * @version 1/24/18
 */
public class TwoDimDemo2
{
    public static void main(String[] args)
    {
        //instanciates a 2d array 4x5
        int[][] nums = new int[4][5];

        int count = 0;
        //fills nums with appropriate values
        for(int row = 0; row < nums.length; row++)
        {
            for(int col = 0; col < nums[row].length; col++)
            {
                nums[row][col] = count;
                count++;
            }
        }

        //method 2 
        for(int row = 0; row < nums.length; row++)
        {
            for(int col = 0; col < nums[row].length; col++)
            {
                nums[row][col] = 5*row + col;
            }
        }

        //prints array nums
        for(int row = 0; row < nums.length; row++)
        {
            for(int col = 0; col < nums[row].length; col++)
            {
                System.out.print(nums[row][col] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n");
        
        //instantiates array arrs for 2b
        int[][] arrs = new int[5][8];
        
        //fills array with correct values
        for(int row = 0; row < arrs.length; row++)
        {
            for(int col = 0; col < arrs[row].length; col++)
            {
                arrs[row][col] = 10*row+col;
            }
        }
        
        for(int row = 0; row < arrs.length; row++)
        {
            for(int col = 0; col < arrs[row].length; col++)
            {
                System.out.print(arrs[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
