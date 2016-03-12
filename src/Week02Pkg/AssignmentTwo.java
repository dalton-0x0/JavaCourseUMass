/* Dalton C. Okechukwu
 * INFO.297 Assignment Two
 * 02-02-2016
 */
package Week02Pkg;

import java.util.Scanner;

public class AssignmentTwo 
{
    public static void main(String[] args)
    {
        Scanner keyboardScanner = new Scanner(System.in);
        
        //Prompt user for input
        System.out.println("Enter a line of text to be URL encoded:");
        
        //Store input in variable
        String inputString = keyboardScanner.nextLine();
        
        //Print user's input and length of characters
        System.out.println();        
        System.out.println("The string read is:     " + inputString);
        System.out.println("Length of chars is:     " + inputString.length());
        
        //Set the encoded output string to empty
        String outputString = "";
        
        //determine number of iteration for loop
        int inpstringLength = inputString.length();
        
        //initialize loop and encode
        for (int count = 0; count <= inpstringLength-1; count++)
        {
            //Get the next character to examine
            char myChar = inputString.charAt(count);
            
            //The characters in this string remain the same after encoding
            String remainSame = "abcdefghijklmnopqrstuvwxyz"
                    + "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                    + "0123456789"
                    + "_-.*";
            
            if (remainSame.indexOf(myChar) >= 0)//check if nect character is unchanged
            {
                outputString += myChar; //update encoded output string
            }
            else if (myChar == ' ') //Check if nect character is space
            {
                myChar = '+';
                outputString += myChar; //update encoded output string
            }
            else //convert all ther characters to 3-character string
            {
                String hexValue = Integer.toHexString(myChar);
                outputString += '%' + hexValue; //update encoded output string
            }            
        }
        //PRint results
        System.out.println("The encoded string:     " + outputString);        
        System.out.println("Length of chars is:     " + outputString.length());     
        
        // Keep console window alive until 'enter' pressed 
        System.out.println();
        System.out.println("Done - press enter key to end program");
        String junk = keyboardScanner.nextLine();
    }
}