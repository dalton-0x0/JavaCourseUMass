/* Dalton C. Okechukwu
 * INFO.297 Assignment One
 * 01-24-2016
 */
package Week01Pkg;

import java.util.Scanner;

public class AssignmentOne 
{
    public static void main(String[] args)
    {
        Scanner keyboardScanner = new Scanner(System.in);
        //Prompt user for input
        System.out.println("Enter a line of text containing the the word "
                + "'java' somewhere within it:");
        //Store input in variable
        String usersWords = keyboardScanner.nextLine();
        //Print user's input and convert to upper and lower case
        System.out.println();        
        System.out.println("The string read is:      " + usersWords);
        System.out.println("Length of chars is:      " + usersWords.length());        
        System.out.println("All lowercase is:        " + usersWords.toLowerCase());        
        System.out.println("All UPPERCASE is:        " + usersWords.toUpperCase());
        //Get index of 'java'
        int whereIsJava = usersWords.indexOf("java");
        //Display 'java' position
        System.out.println("Found 'java' at pos:     " + whereIsJava);
        //Change 'java' to 'Java'
        System.out.println("Changing to 'Java':      " 
                + usersWords.substring(0, whereIsJava) + "Java" 
                + usersWords.substring(whereIsJava+4));
        //Change 'java' to 'JAVA'
        System.out.println("Changing to 'JAVA':      " 
                + usersWords.substring(0, whereIsJava) + "JAVA" 
                + usersWords.substring(whereIsJava+4));
        
        // Keep console window alive until 'enter' pressed 
        System.out.println();
        System.out.println("Done - press enter key to end program");
        String junk = keyboardScanner.nextLine();
    }
}