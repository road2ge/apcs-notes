public class GradingDriver3
{
    public static void main(String[]args)
    {
        UnionEmployee bob = new UnionEmployee("Bob", "Customer Service", 20.00, 15.00);
        System.out.println("Weekly pay: $" + bob.getWeeklyPay(35));
        System.out.println("Weekly pay with overtime: $" + bob.getWeeklyPay(45));
        System.out.println();
        System.out.println(bob);
        System.out.println();
        
        CommissionEmployee rosa = new CommissionEmployee("Rosa", "Sales", 12.00, .025, 10000);
        System.out.println("Weekly pay: $" + rosa.getWeeklyPay(35));
        System.out.println("Weekly pay: $" + rosa.getWeeklyPay(45));
        System.out.println();
        System.out.println(rosa);
    }
}
