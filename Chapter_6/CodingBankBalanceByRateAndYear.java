import java.util.Scanner;

public class CodingBankBalanceByRateAndYear{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double bal = input.nextDouble();
        double[] inrates = {.02, .03, .04, .05}; // this uses an array which it can hold multiple values of the same type
        
        
        //this is the loop for the rates 0.2 .03 0.4 0.5
        for (int i = 0; i < inrates.length; i++) {
            double inrate = inrates[i];
            double Balance = bal;

            System.out.println();
            System.out.println("With an initial balance of " + bal + " at an interest rate of " + inrate);

            //this is the inner loop which shows the balance after years 1-4
            for (int year = 1; year <= 4; year++) {
                Balance += Balance * inrate;
                System.out.println("After year " + year + " balance is " + Balance);
            }
           
        }

        System.exit(0);
    }
}
