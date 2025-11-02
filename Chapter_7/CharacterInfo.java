

public class CharacterInfo {
    
    public static void main(String[] args) {
        char Char = 'C';//this is the character that is tested and you can also change, it can be in a lowercase form or an uppercase and the output will also change depending on what you change.

        System.out.println("The character is " + Char);

        if (Character.isUpperCase(Char))
            System.out.println(Char + " is uppercase");
        else
            System.out.println(Char + " is not uppercase");

        if (Character.isLowerCase(Char))
            System.out.println(Char + " is lowercase");
        else
            System.out.println(Char + " is not lowercase");

        System.out.println("After toLowerCase(), aChar is " + Character.toLowerCase(Char));//this converts and displays the character as a lowercase
        System.out.println("After toUpperCase(), aChar is " + Character.toUpperCase(Char));//this converts and displays the character as an uppercase

        if (Character.isLetterOrDigit(Char)) //this checks if the character is a letter or a digit
            System.out.println(Char + " is a letter or digit");
        else
            System.out.println(Char + " is not a letter or digit");

        if (Character.isWhitespace(Char))
            System.out.println(Char + " is whitespace");
        else
            System.out.println(Char + " is not whitespace");
    }
}
