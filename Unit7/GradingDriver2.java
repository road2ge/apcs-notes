import java.util.*;

public class GradingDriver2
{
    public static void main(String[]args)
    {
        Pet charlie = new Dog("Charlie",10,true);
        Pet bb = new Cat("ButterBean",1,false);
        Pet polly = new GeniusDog("Polly", 18, true, 140);
        
        ArrayList<Pet> kennel = new ArrayList<Pet>();
        kennel.add(charlie);
        kennel.add(bb);
        kennel.add(polly);
        
        for(Pet p : kennel)
        {
            p.eat();
        }
    }
}