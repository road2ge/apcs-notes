
public class CommissionEmployee extends Employee
{
    private double rate;
    private double sales;
    
    public CommissionEmployee(String n, String d, double p, double r, double s)
    {
        super(n,d,p);
        rate = r;
        sales = s;
    }
    
    public double getRate()
    {
        return rate;
    }
    public double getSales()
    {
        return sales;
    }
    public void setRate(double r)
    {
        rate = r;
    }
    public void setSales(double s)
    {
        sales = s;
    }
    
    public double getWeeklyPay(int h)
    {
        double CommissionPay = super.getWeeklyPay(h);
        CommissionPay += sales*rate;
        
        return CommissionPay;
    }
    
    public String toString()
    {
        return super.toString()+
        "\nCommission EMPLOYEE RATE: "+rate+
        "\nCommission EMPLOYEE SALES: "+sales;
                            
    }
    
}
