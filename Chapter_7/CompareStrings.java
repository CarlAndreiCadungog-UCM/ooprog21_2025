import java.util.Scanner;

public class CompareStrings{
    public static void main(String[] args) {
        Scanner compare = new Scanner(System.in);

        System.out.print("Enter your name > ");
        String in = compare.nextLine(); //this is where you will input and what you will input will be scanned in the if else statement below

        String name = "Carmen";//if i change this the result will also change so if i change it to my name carl then the string would be set to carl
 
        if (in.equals(name)) {
            System.out.println("Carmen equals " + in);// this is will be the output if what you input is the same as the predifined string
        } else {
            System.out.println("Carmen does not equal " + in);//and this is the output if its not equal with the predifined string
        }

        compare.close();
    }
}
