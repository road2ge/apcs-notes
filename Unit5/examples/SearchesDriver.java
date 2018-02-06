
/**
 * Tests both methods in the searches class
 * 
 * @author Cliff B.
 * @version 1-16-18
 */
public class SearchesDriver
{
    public static void main(String[] args)
    {
        int[] blah = {1, 6, 10, -9, 0, 5, 1};
        
        System.out.println(Searches.linearSearch(blah, 10));
        System.out.println(Searches.linearSearch(blah, -9));
        System.out.println(Searches.linearSearch(blah, 1));
        System.out.println(Searches.linearSearch(blah, 9001));
        
        int[] arr = {-200, -5, 0, 1, 2, 3, 4, 5};
        
        System.out.println("\n\n"+Searches.binarySearch(arr, 0));
    }
}
