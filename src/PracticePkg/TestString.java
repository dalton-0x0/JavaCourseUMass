/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticePkg;
import java.util.Scanner;
import java.lang.*;
/**
 *
 * @author Chike
 */
public class TestString 
{
    public static boolean isValidInt(String testIntVal)
    {
        int intVal; // parsed integer value
        try
        {
            if((testIntVal != null) && (testIntVal != ""))
                // this if-else takes care of hardcoded null 
                // reference that may be passed to isValidInt
            {
                // if parameter string is not null or empty
                // parse to integer value
                intVal = Integer.parseInt(testIntVal);
            }
            else
            {
                // if null or empty, return false
                return(false);
            }
        }
        catch (NumberFormatException | NullPointerException e)
        {
            // catch other exceptions not null or empty
            // print exception message and return false
            System.out.println(e.getMessage());
            return(false);
        }
        // for successful try block, print message 
        // before final result from calling method
        System.out.println("For input string: \"" + testIntVal + "\"");
        return(true);
    }
    
    public static void main (String[] args)
    {
        Scanner keyboardScanner = new Scanner(System.in);
        
        System.out.println("Enter test string: ");
        
        String testIntVal = keyboardScanner.nextLine();
        
        System.out.println("Result is: " + isValidInt(testIntVal));
        
        System.out.println("Done - press enter key to end program");
        String junk = keyboardScanner.nextLine();
    }
}
