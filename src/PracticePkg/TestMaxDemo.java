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
        // initialize loop counter
        int i = 0; 
        // loop through the array elements
        for (i = 0; i < inputArgs.length; i++)
        {
            // use ternary operator
            maxVal = (inputArgs[i] > maxVal) ? inputArgs[i] : maxVal;
        }
        return (maxVal); // return maximum integer value
    }
    
    public static void main (String[] args)
    {
        // new Scanner object
        Scanner keyboardScanner = new Scanner(System.in);
        
        // initialize array for storage of keyboard inputs
        int[] intInput = {0, 0, 0};
        
        // declare loop counter
        int i;
        
        // we know only 3 arguments from problem statement
        for (i=0; i < 3; i++) 
        {
            // prompt user for input and store in array
            System.out.println("Enter an integer: ");
            intInput[i] = keyboardScanner.nextInt();
        }
        
        // print results
        System.out.println("Input values are: " + intInput[0] + ", " 
                + intInput[1] + ", " + intInput[2] + ". " + "Max value is: " 
                + max(intInput[0], intInput[1], intInput[2]) + ".");
    }
}
