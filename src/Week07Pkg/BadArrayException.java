/* 
 * Author: Dalton C. Okechukwu
 *
 * Course: INFO.297 Assignment Seven
 * 
 * About: Custom Java exception class with two constructors.
 * 
 * Date: 03-10-2016
 */
package Week07Pkg;

public class BadArrayException extends Exception 
{
    public BadArrayException() // Default constructor, no parameters
    {
        // Empty
    }
    // String parameter is the exception message
    public BadArrayException(String exceptionMsg) 
    {
        super(exceptionMsg);   // Pass on to parent exception constructor
    }
}
