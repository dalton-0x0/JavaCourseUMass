/**
 * AltMyTimeDemo - program to test the AltMyTime class.
 * Author: Dalton C. Okechukwu
 * Course: INFO.297 Assignment Three
 * Date: 02-09-2016
 */

// The AltMyTime class must be compiled before this class can be compiled.

package Week03Pkg;

import Week03Pkg.AltMyTime;
import java.util.Scanner;

public class AltMyTimeDemo 
{
    /**
     * main method
     */
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Create a AltMyTime object and set to noon (12 PM).
        AltMyTime noon = new AltMyTime();
        noon.setTime(12, 0, 0);

        AltMyTime wakeup = new AltMyTime();
        wakeup.setTime(6, 30, 0);

        // Ask for time to be input, then create a new AltMyTime and set the time
        int inHour, inMinute, inSecond;
        do {
            System.out.println();
            System.out.println("Enter hour minute and second (-1 to exit)");
            inHour = sc.nextInt();
            if (-1 == inHour)
                break;
            inMinute = sc.nextInt();
            inSecond = sc.nextInt();
            System.out.println();
            System.out.println("Values read were: " + inHour + " " +
                               inMinute + " " + inSecond);

            // Create a new AltMyTime object
            AltMyTime t = new AltMyTime();

            // Set the time to the time read from the keyboard
            t.setTime(inHour,inMinute,inSecond);

            System.out.println(t.toString());
            System.out.println(t.toUniversalString());
            System.out.println("hour is " + t.getHour() + "  minute is " +
                                t.getMinute() + "  second is " + t.getSecond());

            // Test if the time read matches the 'noon' AltMyTime object's value.
            if (t.equals(noon))
                System.out.println("Matches noon time");
            // Test if the time read matches the 'wakeup' AltMyTime objet's value
            if (t.equals(wakeup))
                System.out.println("It's time to wakeup!");

        } while (-1 != inHour);

        // Keep console window alive until 'enter' pressed (if needed).
        System.out.println();
        System.out.println("Done - press enter key to end program");
        String junk = sc.nextLine();
    }
}
