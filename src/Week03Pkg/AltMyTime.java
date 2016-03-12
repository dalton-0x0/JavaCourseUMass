/**
 * MyTime - a simple time class. Program Returns the time from user's input
 * Author:  Dalton C. Okechukwu
 * Course:  INFO.297 Assignment Three
 * Date:    02-09-2016
 */

package Week03Pkg;

public class AltMyTime 
{
    // Instance variables holding the time (in 24 hour universal form).
    private int mHour;      // 0 - 23
    private int mMinute;    // 0 - 59
    private int mSecond;    // 0 - 59

    /**
     * Sets the time value for this MyTime object. If *any* of the parameter
     * values are out of range, the time is set to 00:00:00.
     *
     * @param hour      the hour (0 to 23).
     * @param minute    the minute (0 to 59).
     * @param second    the second (0 to 59).
     */
    public void setTime(int hour, int minute, int second)
    // Add parameter checking code
    {
        // Check if input hour is out of range        
        if ((hour > 23) || (hour < 0))
        {
            // If true, set all the instance variables to zero
            mHour = 0;
            mMinute = 0;
            mSecond = 0;
        }
        // Check if input minute is out of range  
        else if ((minute > 59) || (minute < 0))
        {
            // If true, set all the instance variables to zero
            mHour = 0;
            mMinute = 0;
            mSecond = 0;            
        }
        // Check if input second is out of range  
        else if ((second > 59) || (second < 0))
        {
            // If true, set all the instance variables to zero
            mHour = 0;
            mMinute = 0;
            mSecond = 0;
        }
        // For parameters within range, set the instance variables
        else
        {
            mHour = hour;
            mMinute = minute;
            mSecond = second;
        }               
    }
    /**
     * Returns the hour value represented by this AltMyTime.
     *
     * @return the hour value of this object as an int.
     */
    public int getHour()
    {   
        //return object's hour value
        return mHour;  // TODO - replace
    }

    /**
     * Returns the minute value represented by this AltMyTime.
     *
     * @return the minute value of this object as an int.
     */
    public int getMinute()
    {
        //return object's minute value
        return mMinute;  // TODO - replace
    }

    /**
     * Returns the second value represented by this AltMyTime.
     *
     * @return the second value of this object as an int.
     */
    public int getSecond()
    {
        //return object's second value
        return mSecond;  // TODO - replace
    }
    
    /**
     * Compares this AltMyTime object against another AltMyTime object.
     * The result is true if and only if the argument is not null
     * and represents a time that is the same time as represented
     * by this object
     *
     * @param  other    the object to be compared.
     * @return 
     * @returns  true if both objects represent the same time value,
     *           false otherwise.
     */
    public boolean equals(AltMyTime other)
    {
        /*
        Return 'true' if 'this' AltMyTime matches the time values in the 'other' 
        AltMyTime object, else, return 'false'.
        */
        return ((this.mHour == other.mHour) && (this.mMinute == other.mMinute) 
                && (this.mSecond == other.mSecond));            
    }

    /**
     * Returns the time of this MyTime object in HH:MM:SS AM/PM form.
     *
     * @return the time value represented by this object as a String
     *         formatted as HH:MM:SS AM/PM .
     */
    public String toString()
    {
        String result;// = "";
        /*
        Format the time in the instance variables
        into HH:MM:SS AM/PM time (hour ranges from 1 to 12, AM or PM)
        as a string and return it. Call the twoDigits() method to
        convert each int value to String.
        */
        int localHour = (0 == mHour || 12 == mHour) ? 12 : mHour % 12;
        result = localHour + ":" + twoDigits(mMinute) + ":" + twoDigits(mSecond) +
                     ((mHour < 12) ? " AM" : " PM");
        return result;
    }

    /**
     * Returns the time of this AltMyTime object in 24 hour universal form.
     *
     * @return the time value represented by this object as a String
     *         formatted as HH:MM:SS universal time.
     */
    public String toUniversalString()
    {
        /*
        Format the time in the instance variables
        into HH:MM:SS universal time (hour ranges from 0 to 23)
        as a string and return it. Call the twoDigits() method to
        convert each int value to String.
        */
        
        String result = ""; // initialize result variable
        
        int localHour; // define local variable
        if ((mHour > 0) && (mHour <=23)) // check valid hour values > 0
        {
            localHour = mHour; // assign valid hour to local variable
            // assign result
            result = (twoDigits(localHour) + ":" + twoDigits(mMinute) + ":" 
                + twoDigits(mSecond));
        }
        // check invalid hour values, including valid hour == 0
        else if ((mHour > 23) || (mHour <= 0))  
        {
            // invalid inputs will return 'midnight', 
            // hour == 0 will return 'military tme'
            result = (twoDigits(mHour) + ":" + twoDigits(mMinute) + ":" 
                + twoDigits(mSecond));
        }
        return result;
    }

    /**
     * Returns the parameter value as a two digit String (with leading 0 
     * if needed)
     *
     * @return the parameter 'value' formatted as a two digit String
     *         (with leading zero if needed).
     */
    private String twoDigits(int value)
    {
        /*
        The Integer.toString(int) method to converts 'value' to String format, 
        add a leading "0" if 'value' is less than 10 in order to return a 
        string with two digits.
        */
        String result; // define result

        if (value < 10) // check 'value'
            result = ("0" + Integer.toString(value)); // add leading zero
        
        else
            result = Integer.toString(value); // don't add leading zero

        return result;
    }
}
