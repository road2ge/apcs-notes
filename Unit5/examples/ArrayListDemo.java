
/**
 * Since I don't actually know the methods for this and not going off my good friend Cliff
 * If you're paying attention to my commits, some of the stuff here is by him.
 * Others aren't but whatever.
 * You may call it cheating but I call it sharing notes and work,
 * I give him code snippets/help too :)
 * 
 * @author Kale Miller
 * @version 1/26/2018
 */
import java.util.*;
public class ArrayListDemo
{
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<String>();
        
        friends.add("Reid"); friends.add("Nicholas"); friends.add("Cliff"); friends.add("Jonathan");
        friends.add("Ryan"); friends.add("Evan"); friends.add("Rylee"); friends.add("Albert");
        
        friends.add(0,"Jerrod");
        String drama = friends.set(0,"David");
        
        for(int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }
    }
}
