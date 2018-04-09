
public class GeniusDog extends Dog
{
    private int iq;
    
    GeniusDog(String n, int a, boolean g, int i)
    {
        super(n,a,g);
        iq = i;
    }
    
    public int getIq()
    {
        return iq;
    }
    public void setIq(int i)
    {
        iq = i;
    }
    
    public void eat()
    {
        System.out.println("MMM what delicious caviar and lobster");
    }
    public void poop()
    {
        System.out.println("An unexamined life is not worth living."+
        "[insert smart pooping noises]");
    }
    public void makeNoise()
    {
        System.out.println("I am smart doggo so I can talk");
    }
    
    public String toString()
    {
        return super.toString() + "\nIQ: "+iq;        
    }
}
