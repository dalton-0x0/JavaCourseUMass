/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exceptions;

/**
 *
 * @author Chike
 */
import java.util.Scanner;
public class ExceptionDemo 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        try
        {
            System.out.println("Enter number of donuts:");
            int donutCount = keyboard.nextInt();
            
            System.out.println("Enter number of milk glasses:");
            int milkCount = keyboard.nextInt();
            
            if (milkCount < 1)
                throw new Exception("Exception: No milk!!!");
            
            double donutsPerGlass = donutCount / (double)milkCount;
            System.out.println("You have " + donutCount + " donuts.");
            System.out.println("You have " + milkCount + " glasses of milk.");
            System.out.println("You have " + donutsPerGlass + 
                    " donuts for each glass of milk.");            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Please, go buy some more milk.");
        }
        System.out.println("End of program. Thank you!");
    }
}
