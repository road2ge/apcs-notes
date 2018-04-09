

public class Dog extends Pet
{
    private boolean goodDog;
    
    public Dog(String n, int a, boolean g)
    {
        super(n,a);
        goodDog = g;
    }
    
    //getter and setter
    public boolean getGoodDog()
    {
        return goodDog;
    }
    
    public void setGoodDog(boolean gd)
    {
        goodDog = gd;
    }
    
    public void makeNoise()
    {
        System.out.println("*paw paw* rawr oWo XD");
    }
    
    public void eat()
    {
        System.out.println("Crunch crunch crunch");
    }
    
    public void poop()
    {
        System.out.println("I poop in this bush like a doggo");
    }
    
    public String toString()
    {
        if(goodDog)
            return super.toString()+"\nThis doggo is good doggo.";
        return super.toString()+"\nThis doggo is bad doggo, shame.";
    }
}
