package Week01Pkg;


/**
 * Displays information about the Java Runtime Environment.
 *
 * On a system with a Sun Java SDK installed, compile this source file from a command
 * prompt with the following command (note the 'period' after the -classpath option).
 * Make sure to type JREinfo exactly as shown (upper/lower case is important).
 *
 *   javac -classpath . JREinfo.java
 *
 * If successful, a JREinfo.class file should now exist in the same directory.
 * Run the program with the following command:
 *
 *   java JREinfo
 *
 */

public class JREinfo
{
    public static void main(String[] args)
    {
        String[] names = {
            "java.version",
            "java.vm.version",
            "java.vm.name",
            "java.home",
            "java.class.path",
            "java.ext.dirs",
            "sun.boot.class.path",
        };
        
        System.out.println("JREinfo - Java Runtime Environment properties\n");

        for (int i = 0; i < names.length; i++) {
             System.out.println("  " + names[i] + " = "
                 + System.getProperty(names[i]) + "\n");
        }
        
    }
}