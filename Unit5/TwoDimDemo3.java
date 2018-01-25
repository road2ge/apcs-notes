
/**
 * creates a 2d array of grades
 * 
 * @author Cliff B. & Kale Miller
 * @version 1/25/18
 */
public class TwoDimDemo3
{
    public static void main(String[] args)
    {
        int[][] grades = {  {85, 92, 96},
                            {88, 91, 97},
                            {80, 90, 93},
                            {65, 50, 21},
                            {100, 95, 90}};
        //finds and displays the class average for exam 1
        double sum1 = 0;
        for(int row = 0; row < grades.length; row++)
        {
            sum1 += grades[row][0];
        }
        
        double avg1 = sum1/grades.length;
        
        System.out.println("average grade for exam 1 is" + avg1);
        
        //find dylan average
        double dyl = 0.0;
        for(int column = 0; column < grades[3].length; column++) {
            dyl += grades[3][column];
        }
        System.out.println("Dylan's average is " + dyl/grades[3].length);
        
        //find total class average
        int max = grades[0][0];
        int min = grades[0][0];
        double totalAvg = 0;
        int counter = 0;
        for(int x = 0; x < grades.length; x++) {
            for(int y = 0; y < grades[0].length; y++) {
                if(grades[x][y] < min) min = grades[x][y];
                else if(grades[x][y] > max) max = grades[x][y];
                totalAvg += grades[x][y];
                counter++;
            }
        }
        System.out.println("the class average is " + totalAvg / counter);
        System.out.println("the lowest grade is" + min);
        System.out.println("the highest grade is" + max);
    }
}
