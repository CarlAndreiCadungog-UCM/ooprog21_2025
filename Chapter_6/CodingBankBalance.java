import java.util.Scanner;

   public class CodingBankBalance {
      public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
 
            double bal;
            double rate = 0.03;
            int year = 0;
            int cont = 1;
               //this is the first input
               System.out.print("Enter initial bank balance > ");
               bal = input.nextDouble();

               //after the first input this will be the next  
               System.out.println("Do you want to see next year's balance?");
               System.out.print("Enter 1 for yes or any other number for no >> ");
               cont = input.nextInt();

               //after the 2nd input it will lead now to the loop
            while (cont == 1) {
               //year++ is used so that the year will go up as we continue with the loop so that it will not be fixed to 1
               year++; 
               //this is the equation to get the balance
               bal = bal + (bal * rate);
               
               //this is now the loop and it will only end when you input any number other than 1
               System.out.println("After year " + year + " at 0.03 interest rate, balance is $" + bal);
               System.out.println("\n\nDo you want to see the balance at the end of another year?");
               System.out.print("Enter 1 for yes or any other number for no >> ");
               cont = input.nextInt();
               
               }
            }
       }

