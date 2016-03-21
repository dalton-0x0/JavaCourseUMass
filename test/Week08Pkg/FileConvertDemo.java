/* 
 * Author: Dalton C. Okechukwu
 *
 * Course: INFO.297 Assignment Eight
 * 
 * About: Java demo class reads words from an input file and write them to an 
 * output file, removing extra whitespace and filling each line with as many 
 * words as will fit up to a maximum column width (similar to a column of text 
 * in a newspaper). The maximum column width, input text file name, and output 
 * text file name are entered interactively when the program starts.
 * 
 * Date: 03-21-2016
 */
package Week08Pkg;
import Week08Pkg.FileConvertMethods;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Chike
 */
public class FileConvertDemo 
{
    //Instance variables
    static Scanner input = new Scanner(System.in);
    static File inputFile;
    static File outputFile;
    static FileConvertMethods myFile = new FileConvertMethods();

    public static void main(String[] args) 
    {
        //loops till it gets a valid file name
        boolean correctInput = false;
        String inputFileName = "default.txt";

        while (!correctInput) 
        {
            //User input prompt	    
            inputFileName = myFile.NewFileName("INPUT");
            //Testing to see if the file exists.
            try 
            {
                // create file 
                inputFile = new File(inputFileName);
                if (inputFile.exists()) // check for existance
                {
                    correctInput = true;
                } 
                else 
                {
                    throw new Exception("File not found. Please try again.");
                }

            } 
            catch (Exception e) // exception handling
            {
                //print error message
                System.err.println(e.getMessage());
            }
        }
        // Prompt user for line length
        correctInput = false;
        int lineLength = 0;
        String temp = "";
        while (!correctInput) 
        {
            try 
            {
                System.out.print("Enter LINE LENGTH, choose from 30-100: ");
                temp = input.nextLine();
                // parse input to int, throw NumberFormatException if incorrect
                lineLength = Integer.parseInt(temp);
                // must be between 30 and 100		
                if (lineLength >= 30 && lineLength <= 100) 
                {
                    correctInput = true;
                } 
                else 
                {
                    throw new NumberFormatException("Number out of range. "
                            + " Please choose from 30-100");
                }
            } 
            catch (NumberFormatException nfe) 
            {
                System.err.println(nfe.getMessage());
                correctInput = false;
            }
        }
        //loops till it gets a valid file name
        correctInput = false;
        String outputFileName = "default.txt";
        while (!correctInput) 
        {
            //User input prompt	    
            outputFileName = myFile.NewFileName("OUTPUT");
            //Testing to see if the file exists.
            try 
            {
                //create file to check for existance
                outputFile = new File(outputFileName);
                if (outputFile.exists()) 
                {
                    System.out.print("File already exists. Would you like to "
                            + "overwrite this file? (y/n): ");
                    String overwrite = input.nextLine();
                    if (overwrite.equals("y") || overwrite.equals("Y")) 
                    {
                        // removes file if it exists
                        outputFile.delete();
                        outputFile.createNewFile();
                        correctInput = true;
                    } 
                    else 
                    {
                        outputFileName = myFile.NewFileName("OUTPUT");
                        correctInput = false;
                        continue;
                    }

                } 
                else 
                {
                    outputFile.createNewFile();
                    break;
                }

            } catch (Exception e) 
            {
                //print error message
                System.err.println(e.getMessage());
            }
        }

        // Most important line of this program.       
        String formattedText = myFile.ConvertFileToString(inputFileName, lineLength);
        // The final output of this program
        StringBuilder endingString = new StringBuilder();
        // add line of * to show what the correct line width should be.
        int x;
        for (x = 0; x < lineLength; x++) 
        {
            endingString.append("*"); // line of  * characters the width of the 
            // formatted output as a heading in the output file 
        }
        // new line
        endingString.append("\n");
        endingString.append(formattedText);
        endingString.append("\n");
        // save the formatted string to the specified file.        
        myFile.SaveStringToFile(outputFile.toString(), endingString.toString());
    }// end main()
}
