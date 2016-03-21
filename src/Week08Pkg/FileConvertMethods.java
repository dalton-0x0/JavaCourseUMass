/* 
 * Author: Dalton C. Okechukwu
 *
 * Course: INFO.297 Assignment Eight
 * 
 * About: Java class reads words from an input file and write them to an 
 * output file, removing extra whitespace and filling each line with as many 
 * words as will fit up to a maximum column width (similar to a column of text 
 * in a newspaper). The maximum column width, input text file name, and output 
 * text file name are entered interactively when the program starts.
 * 
 * Date: 03-21-2016
 */
package Week08Pkg;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Chike
 */
public class FileConvertMethods 
{
    // input file
    Scanner input = new Scanner(System.in);
    
    // convert input file to string
    public String ConvertFileToString(String inputFile, int lineLength) 
    {
	// BufferedReader class reads text from a character-input stream, 
        // buffering characters so as to provide for their efficient reading.
        BufferedReader br = null;
        // StringBuilder class is mutable sequence of characters
	StringBuilder output = new StringBuilder();
	try 
        {
	    String currentLine;
	    br = new BufferedReader(new FileReader(inputFile));
	    int currLineLength = 0;
	    // read each line till null, i.e. end of file
	    while ((currentLine = br.readLine()) != null) 
            {
		// split current line, form array of words
		String[] tempList = currentLine.split("[ \t\n]+");
		// loop through current line, add to string builder
		for (String word : tempList) 
                {
		    // if the length of the current word plus the current line 
                    // length is greater than the specified line length
		    // split the line and continue on the next line
		    if ((currLineLength + word.length()) > lineLength) 
                    {
			boolean lineOk = false; // set flag
			while (!lineOk)         // while true
                        {
			    if (word.length() > lineLength) 
                            {
				// split word and add to the next line
				String tempLine = word.substring
                                (0, Math.abs(lineLength - currLineLength));
				output.append(tempLine);
				output.append("\n");
				// create a second word from remaining string
				String tempLine2 = word.substring
                                (Math.abs(lineLength - currLineLength));
				// current line length is same size as the 
                                // second half of the split
				currLineLength = tempLine2.length();
							
				if (currLineLength > lineLength) 
                                // if the split section is too long still, then	
                                {
				    // reset the word to be the new section
				    word = tempLine2;
				    lineOk = false; // flag to repeat
				} 
                                else 
                                {
				    output.append(tempLine2); // add temp2
				    lineOk = true; // flag to end
				}
			    } 
                            else 
                            {
				lineOk = true;
				output.append("\n");
				output.append(word);
				output.append(" ");
                                // reset line length
				currLineLength = word.length() + 1;
			    }
			}
		    } 
                    else 
                    {
			output.append(word);
			output.append(" ");
                        // keep line length
			currLineLength += word.length(); 
                        // increment line length to account for space 
			currLineLength++; 
		    }
		}
	    }	    
	br.close();
	} 
        catch (IOException e) // exception handling
        {
	    System.err.println(e.getMessage());
	}
	return output.toString();
    }
    
    // method saves string to file
    public void SaveStringToFile(String fileName, String stringInput) 
    {
	// use relative file path
	File file = new File(fileName);  
	try 
        {
	    //create buffered output stream
	    FileWriter fw = new FileWriter(file.getAbsoluteFile());
	    BufferedWriter bw = new BufferedWriter(fw);
	    bw.write(stringInput); // write to file 
	    bw.close(); // close I/O stream
	} 
        catch (IOException ioe) // exception handling
        {
	    System.err.println(ioe.getMessage());
	}
	System.out.println("OUTPUT file SAVED here: " + file.getAbsolutePath());
        // Keep console window alive until 'enter' is pressed 
        System.out.println("OUTPUT file SAVED - press ENTER to end program.");
        String junk = input.nextLine();
    }
    // file name method
    public String NewFileName(String type) 
    {
	System.out.print(type + 
                " file name (include extension, e.g. '.txt'): ");
	String outputFileName = input.nextLine();
	return outputFileName;
    }
}