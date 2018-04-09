
public abstract class Pet
{
    private String name;
    private int age;
    
    public Pet(String n, int a)
    {
        name = n;
        age = a;
    }
    
    //getters and setters
    public void setName(String n)
    {
        name = n;
    }
    public void setAge(int a)
    {
        age = a;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    //abstract methods
    abstract public void makeNoise();
    abstract public void eat();
    abstract public void poop();//real mature
    //what good code would be complete without overwriting toString()?
        //answer NONE
    public String toString()
    {
        return "\nName: "+name+"\nAge: "+age;
    }
    
     
    
    
}