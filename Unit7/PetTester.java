import java.util.*;

public class PetTester
{
    public static void main(String[]args)
    {
        Pet lassie = new Dog("Lassie",9,true);
        Pet garfield = new Cat("Garfield",22,true);
        Pet brian = new GeniusDog("Brian", 12, false, 135);
        
        ArrayList<Pet> kennel = new ArrayList<Pet>();
        kennel.add(lassie);
        kennel.add(garfield);
        kennel.add(brian);
        
        for(Pet p : kennel)
        {
            p.poop();
        }
    }
}