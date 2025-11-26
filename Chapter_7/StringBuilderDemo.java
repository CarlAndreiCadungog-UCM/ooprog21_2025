public class StringBuilderDemo {
    public static void main(String[] args) {

        //this is the string builder variables
        StringBuilder name = new StringBuilder("Barbara");
        StringBuilder add = new StringBuilder("6311 Hickory Nut Grove Road");

        //this will display the initial string and their capacities
        System.out.println("(StringBuilder 1) nameString: " + name.toString());
        System.out.println("Capacity of nameString is: " + name.capacity());

        System.out.println("(StringBuilder 2) addressString: " + add.toString());
        System.out.println("Capacity of addressString is: " + add.capacity());

        //this is where i can alter the length of the string builder variables so if ever i will change the length for the name string for example to 6 then the result would be barbar
        name.setLength(20);
        add.setLength(20);

        //so after i alter the length then this will print the altered length to whatever i altered for example the name set to length 6 then the length of the name would value to 6
        System.out.println("(Length set to 20 for StringBuilder 1) The name is " + name);
        System.out.println("(Length set to 20 for StringBuilder 2) The address is " + add);
    }
}

