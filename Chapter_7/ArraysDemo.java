import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        int[] numbers = new int[5];//the new int[5] makes it so that there are 5 integers used in the array that is why (0 0 0 0 0) --> so this is only 5 integers
        //and also the default value of the array is 0 
        
        display("Original array:", numbers);//this displays the default value of the array which is 0

        Arrays.fill(numbers, 8); //this changes the value of the array to 8 so instead of the default value 0 it will be replaced with the number 8
        display("After filling with 8s:", numbers);

        numbers[2] = 6; //number[2] changes the 3rd element
        numbers[4] = 3; //number[4] changes the 5th element
        display("After changing two values:", numbers);

        Arrays.sort(numbers);//this part sorts out the number from lowest value to highest that is why after we changed the values it is arranged from lowest to highest and that is why the order changed to 3 6 8 8 8
        display("After sorting:", numbers);
    }

    
    public static void display(String message, int[] array) {
        System.out.print(message + "\t");//the purpose of this is it adds a space after the message so that the numbers would line up neatly
        for (int num : array) {
            System.out.print(num + " ");//the purpose of this is it prints the elements or the numbers rather on the same line and is separated with a space that is why the numbers are separated in a space like this 0 0 0 0 0
        }
        System.out.println();//this part basically means print then move to the next line so after printing a line it moves on to the next line
    }
}
