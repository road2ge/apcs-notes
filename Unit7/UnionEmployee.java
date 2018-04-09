
public class UnionEmployee extends Employee
{
    private double dues;
    
    public UnionEmployee(String n, String d, double p, double du)
    {
        super(n,d,p);
        dues = du;
    }
    
    //getter and setter
    public void setDues(double du)
    {
        dues = du;
    }
    public double getDues()
    {
        return dues;
    }
    
    public double getWeeklyPay(int h)
    {
       double unionPay;
       if(h <= 40)
       {
           unionPay = super.getWeeklyPay(h);
       }
       else
       {
           unionPay = super.getWeeklyPay(h) + super.getWeeklyPay(h-40)*1.5;
       }
       unionPay = unionPay - dues;
       return unionPay;
    }
    
    public String toString()
    {
        return super.toString()+
               "\nUNION EMPLOYEE DUES: "+dues;
    }
}
