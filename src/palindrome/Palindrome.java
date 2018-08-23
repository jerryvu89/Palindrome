/*
Java program to check if a string is a palindrome or not.
A string is a palindrome if it remains unchanged when reversed, for example,
"dad" is a palindrome as a reverse of "dad".
 */
package palindrome;
import java.util.*;

/**
 * @author Jerry Vu
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a string to check if it is a palindrome");
        original = in.nextLine();
        
        int length = original.length();
        
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        
        if (original.equals(reverse))
            System.out.println("The string entered is a palindrome.");
        else
            System.out.println("The string entered is not a palindrome.");
    }
    
}