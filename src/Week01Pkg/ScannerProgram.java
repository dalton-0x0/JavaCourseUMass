/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week01Pkg;
import java.util.Scanner;
/**
 *
 * @author Chike
 */
public class ScannerProgram 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello out there, nice to meet you");
        System.out.println("I will add any two numbers for you.");
        System.out.println("Enter two whole numbers in next line, use spacebar:");
        
        int n1, n2;
        
        Scanner keyboard = new Scanner(System.in);
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();
        
        System.out.println("Thanks, the sum of your numbers is:");
        System.out.println(n1 + n2);
    }
}
