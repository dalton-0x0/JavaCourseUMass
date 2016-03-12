/* 
 * Author: Dalton C. Okechukwu
 *
 * Course: INFO.297 Assignment Seven
 * 
 * About: Class containing four public methods that return minimum value in an 
 * array, range of values, first occurrence of a value and alast occurrence of 
 * a given parameter.
 * 
 * Date: 03-10-2016
 */
package Week07Pkg;

public class ArrayUtils 
{
    public static int minValue(int[] list) throws BadArrayException 
    {
        if (list == null)                     // if null, throw exception
        {
            throw new BadArrayException("Array is null");
        }
        if (list.length == 0)                 // if empty, throw exception
        {
            throw new BadArrayException("Array is empty");
        }
        // Search the array parameter once
        // Define local variables
        int arrayElementIndex;                // initialize loop index
        int minArrayValue = list[0];          // assign minimum to first element
        // Use for loop since array size is list.length
        for (arrayElementIndex = 0; 
                arrayElementIndex < list.length; 
                arrayElementIndex++)
        {
            if (list[arrayElementIndex] < minArrayValue)
            {
                // if current element is less than min, re-assign
                minArrayValue = list[arrayElementIndex];
                // else, do nothing
            }        
        }
        return minArrayValue;                 // return result to calling code
    }
    public static int[] copyRange(int[] list, int startIndex)
            throws BadArrayException, ArrayIndexOutOfBoundsException
    {
        if (list == null)                     // if null, throw exception   
        {
            throw new BadArrayException("Array is null");
        }
        // if parameter startIndex is out of bounds, throw exception
        if ((startIndex < 0) || (startIndex > list.length))
        {
            throw new ArrayIndexOutOfBoundsException(startIndex);
        }
        int lengthNewArray = (list.length - startIndex);   // new array length
        int[] newArray = new int[lengthNewArray];          // new array
        int loopIndex;                                     // loop index
        // re-assign startIndex so it doesn't change
        int newStartIndex = startIndex;  
        // use for loop since array length is known
        for (loopIndex = 0; loopIndex < lengthNewArray; loopIndex++)
        {
            // assign elements from list[] to new array 
            // starting from newStartIndex
            newArray[loopIndex] = list[newStartIndex];  
            // once assignment is done, increment index 
            // and assign next value to newArray[] till loop ends
            newStartIndex++; 
        }
        return newArray;                      // return result to calling code
    }
    public static int indexOf(int[] list, int searchValue) 
            throws BadArrayException
    {
        if (list == null)                     // if null, throw exception   
        {
            throw new BadArrayException("Array is null");
        }
        // If the array parameter is length 0, it must return -1
        if (list.length == 0) 
        {
            return -1;
        }
        // Search the array parameter once
        // Define local variables
        // Assign location of first occurence of search value to first 
        int searchValueLocation = 0;
        // Use while loop since increment will take place in nested if-else
        while (searchValueLocation < list.length)
        {
            if (searchValue == list[searchValueLocation])
            {
                return searchValueLocation; // first location is found, return
            }
            else
            {
                try 
                {
                    // increment location and try again
                    searchValueLocation++;
                }
                // otherwise catch exception
                catch (ArrayIndexOutOfBoundsException e)
                {
                    // return not found (-1) if try doesn't work
                    return -1;
                }
            }
        }
        // return -1 for any other
        return -1;                               
    }
    public static int lastIndexOf(int[] list, int searchValue) 
            throws BadArrayException 
    {
        if (list == null)                   // if null, throw exception   
        {
            throw new BadArrayException("Array is null");
        }
        // If the array parameter is length 0, it must return -1
        if (list.length == 0) 
        {
            return -1;
        }
        int lastIndex = -1; // assign default: no last index
        int loopIndex;
        for (loopIndex = 0; loopIndex < list.length; loopIndex++)
        {
            if (searchValue == list[loopIndex])
            {
                lastIndex = loopIndex;    // re-assign lastIndex until end loop
            }
        }
        return lastIndex;                 // return result to calling code
    }
}
