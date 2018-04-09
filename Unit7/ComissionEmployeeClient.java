
public class ComissionEmployeeClient
{
   public static void main(String[] args)
   {
       Employee bob = new Employee("Bob", "Manufacturing", 22.5);
       UnionEmployee cob = new UnionEmployee("Coby", "Engineering", 60.5, 5.25); 
       CommissionEmployee rob = new CommissionEmployee("Robert", "Sales", 30.25, .15, 10000.5);
       
       System.out.println("BOB:\n"+bob.toString());
       System.out.println("Bob weekly pay, 40 hrs: "+bob.getWeeklyPay(40)); 
       System.out.println("Bob weekly pay, 45 hrs: "+bob.getWeeklyPay(45));
       System.out.println("Bob weekly pay, 30 hrs: "+bob.getWeeklyPay(30));
       
       System.out.println("COBY:\n"+cob.toString());
       System.out.println("Coby weekly pay, 40 hrs: "+cob.getWeeklyPay(40));
       System.out.println("Coby weekly pay, 45 hrs: "+cob.getWeeklyPay(45));
       System.out.println("Coby weekly pay, 30 hrs: "+cob.getWeeklyPay(30));
       
       System.out.println("ROB:\n"+rob.toString());
       System.out.println("Rob weekly pay, 40 hrs: "+rob.getWeeklyPay(40));
       System.out.println("Rob weekly pay, 45 hrs: "+bob.getWeeklyPay(45));
       System.out.println("Rob weekly pay, 30 hrs: "+bob.getWeeklyPay(30));
       
       
   }
}
