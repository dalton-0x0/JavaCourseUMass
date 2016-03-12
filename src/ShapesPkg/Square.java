/* 
 * Author: Dalton C. Okechukwu
 *
 * Course: INFO.297 Assignment Six
 * 
 * About: Class that extends Shape. Derived class for Square Shape object.
 * 
 * Date: 02-29-2016
 */
package ShapesPkg;

/**
 * @author Chike
 */
public class Square extends Shape
{
    private double mLength; //instance variable, length
       
    public Square(String color, double length) // constructor 
            //that invokes the base constructor (passing the color), then
            //sets the value of the length of one of the sides
    {
        super(color); //call super class constructor
        this.mLength = length; //assign this length
    }
    
    public double area() //calculate area of a sqaure
    {
        double squareArea = (Math.pow(this.mLength, 2)); //area = l^2
        return (squareArea); //return square area
    }
    
    public String toString() //return object's description
    {
        return (this.getColor() + " SQUARE with side length of " + this.mLength 
                + " and area of " + area());
    }
}