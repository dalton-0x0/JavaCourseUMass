/* 
 * Author: Dalton C. Okechukwu
 *
 * Course: INFO.297 Assignment Five
 * 
 * About: Java class with no instance variables that creates an array of 
 * integers, fills it with values, prints the unsorted values, sorts the values 
 * into ascending order, and finally prints the sorted values.
 * 
 * Date: 02-23-2016
 */
package Week05Pkg;

import java.util.Scanner;

public class ArraySort //sorts array of integers in ascending order
{
    public static void fillArray(int[] array) //method to read values into array
    {
        //prompt user for input of each array elements
        System.out.println("Enter " + array.length + " values");
        for (int i = 0; i < array.length; i++)
        {
            Scanner keyboardIndexScanner = new Scanner(System.in);
            System.out.println("Enter value for element " + i + ":");
            array[i] = keyboardIndexScanner.nextInt(); //assign inputted value
            System.out.println(); //print blank line for readability
        }
    }
    
    public static void sortArray(int[] array) // method to sort the array
    {
        boolean swapped; //create boolean variable for do-while loop
        do
        {
            //initialize to false but do-while will execute at least once
            swapped = false; 
            //check array up to 'second to last' index not last!
            for (int i = 0; i < array.length-1; i++) 
            {
                if (array[i] > array[i+1]) //compare sizes
                {
                    int temp = array[i]; //assign greater to temp variable
                    array[i] = array[i+1]; //assign smaller to current index
                    array[i+1] = temp; //assign greater (in temp) to next index
                    swapped = true;
                }
            }
        } while(swapped); //end do-while if not true
    }
    public static void printArray(int[] array) //method to print array elements 
    {
        for (int i = 0; i < array.length; i++)
        {
        System.out.println(array[i]);//print contents of each index
        }
    }

    public static void main(String[] args) //main method
    {
        Scanner keyboardSizeScanner = new Scanner(System.in);
        //Prompt user for input
        System.out.println("Enter the size of the array (3 to 10): ");
        //assign user's input to variable
        int arrayLength = keyboardSizeScanner.nextInt();
        //check if input is valid
        while (arrayLength > 0)
        {
            if (arrayLength <= 10 && arrayLength >=3)
            {
                break; //if valid, do nothing
            }
            else
            {
                //prompt user to make correct input
                System.out.println("Out if range! Choose 3 to 10: ");
                keyboardSizeScanner = new Scanner(System.in);
                arrayLength = keyboardSizeScanner.nextInt();                
            }
        }
        int[] array = new int[arrayLength]; //initialize array from user's input
        fillArray(array); //call method to get array elements
        System.out.println("The unsorted values...");
        printArray(array); //call method to print unsorted input
        sortArray(array); //call method to sort the array
        System.out.println(); //print blank line for readability
        System.out.println("The sorted values...");
        printArray(array); //call method to print sorted array
        
        // Keep console window alive until 'enter' is pressed 
        System.out.println();
        System.out.println("Done - press enter key to end program");
        String junk = keyboardSizeScanner.nextLine();
    }
}