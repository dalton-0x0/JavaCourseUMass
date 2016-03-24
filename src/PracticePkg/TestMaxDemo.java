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
public class TestMaxDemo 
{
    public static int max(int val1, int val2, int val3)
    {
        // initialize array
        int[] inputArgs = {val1, val2, val3};
        // arbitrarily assign max value to first element
        int maxVal = inputArgs[0];
        int i = 0; // loop counter
        for (i = 0; i < inputArgs.length; i++)
        {
            maxVal = (inputArgs[i] > maxVal) ? 
                    inputArgs[i] : maxVal;
        }
        return (maxVal);
    }
    
    public static void main (String[] args)
    {
        Scanner keyboardScanner = new Scanner(System.in);
        
        int[] intInput = {0, 0, 0};
        
        int i;
        
        for (i=0; i < 3; i++)
        {
            System.out.println("Enter an integer: ");
            intInput[i] = keyboardScanner.nextInt();
        }
        
         System.out.println("Input values are: " + intInput[0] + " " 
                 + intInput[1] + " " + intInput[2] + ". Max value is " 
                 + max(intInput[0], intInput[1], intInput[2]));
        
        System.out.println("Done - press enter key to end program");
        String junk = keyboardScanner.nextLine();
    }
}
