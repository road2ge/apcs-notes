
/**
 * supplemental program
 *
 * @author Kale Miller
 * @version 2/7/2018
 */
public class ArrayMethods
{
    public static void fillRandomly(int[][]arrs) {
        for(int i = 0; i < arrs.length;i++) {
            for(int j = 0; j < arrs[i].length;j++) {
                arrs[i][j] = (int)Math.random() * 50 + 1;
            }
        }
    }
    public static void fillExactly(int[][]arrs, int z) {
        for(int x=0;x<arrs.length;x++) {
            for(int y=0;y<arrs[x].length;y++) {
                arrs[x][y] = z;
            }
        }
    }
    public static int minColumn(int[][]arrs,int xpos) {
        int min = arrs[xpos][0];
        for(int y = 0;y<arrs[x].length;y++) {
            if(arrs[xpos][y]<min) min = arrs[xpos][y];
        }
        return min;
    }
    public static int elementCount(int[][]arrs,int el) {
        int count = 0;
        for(int x=0;x<arrs.length;x++) {
            for(int y=0;y<arrs[x].length;y++) {
                if(arrs[x][y] == el) count++;
            }
        }
        return count;
    }
}
