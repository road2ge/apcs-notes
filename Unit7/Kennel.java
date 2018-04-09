import java.util.*;
public class Kennel
{
    public static void main(String[] args)
    {
        Pet gracie = new Cat("Gracie", 5, false);
        Pet piper = new Dog("Piper", 13, true);
        Pet shelby = new GeniusDog("Shelby", 3, false, 9001);
        
        ArrayList<Pet> myPets = new ArrayList<>();
        
        myPets.add(gracie);
        myPets.add(piper);
        myPets.add(shelby);
        
        for(int i = 0; i < 3; i++)
        {
            System.out.println(myPets.get(i).toString());
            myPets.get(i).poop();
        }
    }
}
