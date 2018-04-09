
public class Employee
{
    private String name;
    private String department;
    private double pay;
    
    public Employee(String n, String d, double p)
    {
        name = n;
        department = d;
        pay = p;
    }
    
    //lots o getters and setters
    public String getName()
    {
        return name;
    }
    public String getDepartment()
    {
        return department;
    }
    public double getPay()
    {
        return pay;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setDepartment(String d)
    {
        department = d;
    }
    public void setPay(double p)
    {
        pay = p;
    }
    
    public double getWeeklyPay(int h)
    {
        if(h < 40)
            return pay*h;
        return pay*40;
        
    }
    
    public String toString()
    {
        return "\nEMPLOYEE NAME: "+name+
               "\nEMPLOYEE DEPARTMENT: "+department+
               "\nEMPLOYEE PAY: "+pay;
    }
    
    
}