/* 
 * Author: Dalton C. Okechukwu
 *
 * Course: INFO.297 Assignment Four
 * 
 * About: Java class with an instance variable that is a String reference, 
 * a constructor method, a set of overloaded methods, and a class static method.
 * Arguments are added to the URL as "name=value", where "name" and "value" 
 * are URL encoded. 
 * 
 * Date: 02-17-2016
 */
package Week04Pkg;

public class MyUrl 
{
    private String mUrl; //define instance variable that is a String
    
    public MyUrl(String url) //define constructor method to initislize mUrl
    {
        mUrl = url;
        //check if mUrl starts with protocol prefix "http://"
        if (mUrl.startsWith("http://")) 
        {
            //do nothing
        }
        else
        {
            mUrl = "http://" + mUrl; //add protocol prefix
        }
    }
    //define overload mehtods to add arguments to mUrl
    public void addArgument(String name, String value)
    {
        String urlArgument; //define argument string
                
        name = urlEncode(name); //encode "name" by calling urlEncode method
        value = urlEncode(value); //encode "value" by calling urlEncode method
        urlArgument = name + "=" + value; //concatenate input arguments
        
        if (mUrl.contains("?"))        
            mUrl = mUrl + "&" + urlArgument; //"&" precedes subsequent urlArguments
                    
        else
            mUrl = mUrl + "?" + urlArgument; //"?" precedes the first urlArgument  
    }
    
    public void addArgument(String name, int ivalue)
    {
        String urlArgument;
        String value;
        
        name = urlEncode(name);
        value = urlEncode(Integer.toString(ivalue));//convert integer to string
        urlArgument = name + "=" + value;
        
        if (mUrl.contains("?"))        
            mUrl = mUrl + "&" + urlArgument;
                    
        else
            mUrl = mUrl + "?" + urlArgument;
    }
    
    public void addArgument(String name, double dvalue)
    {
        String urlArgument;
        String value;
        
        name = urlEncode(name);
        value = urlEncode(Double.toString(dvalue));//convert double to string
        urlArgument = name + "=" + value;
        
        if (mUrl.contains("?"))        
            mUrl = mUrl + "&" + urlArgument;
                    
        else
            mUrl = mUrl + "?" + urlArgument;
    }
    
    public String toString() 
    {
        return mUrl; //return base url plus all arguments
    }
    
    public static String urlEncode(String text) // code from assignment two
    {
        String encodedString = "";
        
        //determine number of iteration for loop
        int textLength = text.length();
        
        //initialize loop and encode
        for (int count = 0; count <= textLength-1; count++)
        {
            //Get the next character to examine
            char myChar = text.charAt(count);
            
            //The characters in this string remain the same after encoding
            String remainSame = "abcdefghijklmnopqrstuvwxyz"
                    + "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                    + "0123456789"
                    + "_-.*";
            
            if (remainSame.indexOf(myChar) >= 0)//check if next character is unchanged
            {
                encodedString += myChar; //update encoded output string
            }
            else if (myChar == ' ') //Check if next character is space
            {
                myChar = '+';
                encodedString += myChar; //update encoded output string
            }
            else //convert all other characters to 3-character string
            {
                String hexValue = Integer.toHexString(myChar);
                encodedString += '%' + hexValue; //update encoded output string
            }
        }
        return encodedString;
    }
}