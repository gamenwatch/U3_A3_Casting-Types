 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u3_a3_casting.types;
import java.util.Scanner;

/**
 * Jacob
 * Practicing casting types
 */
public class U3_A3_CastingTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);   

        // Cast Int to Double
        System.out.println("Please enter a whole number.");
        int intNumOne = keyedInput.nextInt(); 
        double doubleNumOne;
        doubleNumOne = (double)intNumOne;
        System.out.println(doubleNumOne);

        // Cast Double to Int
        System.out.println("Please enter a decimal number.");
        double doubleNumTwo = keyedInput.nextDouble(); 
        int intNumTwo;
        intNumTwo = (int)doubleNumTwo;
        System.out.println(intNumTwo);
        
        // Cast Char to String
        System.out.println("Please enter a single character.");
        char charThree = keyedInput.next().charAt(0);
        String stringThree;
        stringThree = String.valueOf(charThree);
        System.out.println(stringThree);
        
        // Cast String to Char
        System.out.println("Please enter a string.");
        String stringFour = keyedInput.next();
        char charFour;
        charFour = stringFour.charAt(0);
        System.out.println(charFour);
        
        // Cast String to Int
        System.out.println("Please enter a whole number.");
        String stringFive = keyedInput.nextLine(); 
        int intNumFive;
        intNumFive = Integer.parseInt(stringFive);
        System.out.println(intNumFive);
        
    }
    
}
