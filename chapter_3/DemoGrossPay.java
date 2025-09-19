
public class DemoGrossPay {
   
   //this is the main method
   public static void main(String[] args){
      
      //this are the hours worked
      calculateGross(10.0);
      calculateGross(25.0);
      calculateGross(37.5);
      
   }
   
   
   public static final double Hourly_Rate = 22.75; //this is the fixed hourly rate
   
   //this method is for calculating the gross pay
   public static void calculateGross(double hoursIn){
      
      double grossPay = hoursIn * Hourly_Rate;
      System.out.println(hoursIn + "hours at $" + Hourly_Rate + "per hour is $" + grossPay);
   }

}

