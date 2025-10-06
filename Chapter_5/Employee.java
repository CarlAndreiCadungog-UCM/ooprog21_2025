public class Employee {

   private int empNo;
   private double payR;
   private static final double Over_Time = 1.5;

   public Employee(int empNo, double payR) {
    
      this.empNo = empNo;
      this.payR = payR;
     
   }

   public double calculateRegularPay(int hoursWorked) {
    
      if (hoursWorked > 40) {
      
         return 40 * payR;
   
   }else {
     
      return hoursWorked * payR;
   
      }
     
   }

   public double calculateOvertimePay(int hoursWorked) {
    
      if (hoursWorked > 40) {
     
         int overtimeHours = hoursWorked - 40;
         return overtimeHours * payR * Over_Time;
   
   }else {
     
         return 0;
   
      }
     
   }
    
}
