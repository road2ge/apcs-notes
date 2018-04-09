
public class Cat extends Pet
{
    private boolean declawed;
    
    public Cat(String n, int a, boolean d)
    {
        super(n, a);
        declawed = d;
    }
    
    public void setDeclawed(boolean d)
    {
        declawed = d;
    }
    
    public boolean getDeclawed()
    {
        return declawed;
    }
    
    public void makeNoise()
    {
        System.out.println("Meow, Meow, Meow, Meow, Meow, Meow, Meow");
    }
    
    public void eat()
    {
        System.out.println("Mush mush mush");
    }
    
    public void poop()
    {
        System.out.println("I poop on middle of rug like a cat"); //the cat's takin a big ol' crap
    }
    
    public String toString()
    {
        if(declawed)
            return super.toString()+"\nThis cat has claws! Look out!";
        return super.toString()+"\nThis cat does not have claws.";
    }
    
    
}
