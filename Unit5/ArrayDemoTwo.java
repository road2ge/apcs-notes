
/**
 * Creates an array and uses the length constant.
 * 
 * @author Cliff B.
 * @version 1-11-18
 */
public class ArrayDemoTwo
{
    public static void main(String[] args)
    {
        int[] nums = new int[8];
        
        //loads the array with multiples of two... non inclusive of zero
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = (i+1)*2;
        }
        
        for(int i = 0; i < nums.length; i++)
        {
            System.out.println("nums["+i+"] = "+nums[i]);
        }
        
        System.out.println();
        
        for(int i = nums.length - 1; i >= 0; i--)
        {
            System.out.println("nums["+i+"] = "+nums[i]);
        }
    }
}
