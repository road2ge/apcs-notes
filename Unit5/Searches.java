
/**
 * Writes static methods for linear and binary searches
 * 
 * @author Cliff B.
 * @version 1-16-18
 */
public class Searches
{
   /**
    * A method that finds the first instance of a target value in a given array
    * Returns -1 if the target value is not found
    * 
    * @param arr an array of integers
    * @param target value being searched for
    * @return       the index of the target or -1
    */
   public static int binarySearch(int[] numbers, int target)
   {
       int low = 0; int high = numbers.length - 1; int middle = low+high/2;//g
       
       while(numbers[middle] != target && low <= high)
       {
       if(target < numbers[middle])
            high = middle - 1;
       else
            {
                low = middle + 1;//o
            }
       middle = (low + high)/2;
       
        }
        if(numbers[middle] == target)
            return middle;
        else
            return -1;
    }
   
   
    public static int linearSearch(int[] arr, int target)
   {
       for(int index = 0; index < arr.length; index++)//i
       {
           if(arr[index] == target)
                return index;
       }
       return -1;
   }
   
}//e


