import java.util.Scanner;

   public class Payroll {
   public static void main(String[] args) {
   
      Scanner scanner = new Scanner(System.in);

         System.out.print("How many hours did you work this week? ");
            int hoursWorked = scanner.nextInt();

         System.out.print("What is your regular pay rate? ");
            double payRate = scanner.nextDouble();

         Employee empl = new Employee(9999, payRate); 

         double regularPay = empl.calculateRegularPay(hoursWorked);
         double overtimePay = empl.calculateOvertimePay(hoursWorked);

         System.out.println("Regular pay is " + regularPay);
         System.out.println("Overtime pay is " + overtimePay);

   }

}
