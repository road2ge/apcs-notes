
/**
 * Creates an array object and manipulates in various ways
 * 
 * @author Cliff B.
 * @version 1/10/2018
 */
public class ArrayDemoOne
{
    public static void main(String[] args)
    {
        int[] grades = new int[5];      //creates an array object of integers with side 5

        grades[0] = 100;    //loads the array one element at a time
        grades[1] = 90;
        grades[2] = 70;
        grades[3] = 23;
        grades[4] = 98;
        //grades[5] = 100;    //dosen't store value

        System.out.println("Kaylin's test grade: "+grades[2]);

        grades[3] = 86;     //overwrites existing value in grades[3]

        System.out.println("Ben's test grade: "+grades[3]);
        
        //creates a different array
        int[] arr = new int[10];
        
        //fills arr with integers 1-10 utilizing aa for loop
        
        for(int i = 1; i <= 10; i++)
        {
            arr[i - 1] = i;
        }
        
        /*or
         * for(int i = 0; i < 10; i++)
         * {
            arr[i] = i+1;
         * }
         */
        
        for(int i = 0; i < 10; i++)
        {
            System.out.print(arr[i]+"\t");
        }
        

    }
}
