/* 
 * Author: Dalton C. Okechukwu
 *
 * Course: INFO.297 Assignment Six
 * 
 * About: Class that extends Shape. Derived class for Rectangle Shape object.
 * 
 * Date: 02-29-2016
 */
package ShapesPkg;

/**
 * @author Chike
 */
public class Rectangle extends Shape
{
    private double mLength; //instance variable, length
    private double mWidth; //instance variable, width
    
    public Rectangle(String color, double width, double length) // constructor 
            //that invokes the base constructor (passing the color), then
            //sets the width and length values
    {
        super(color); //call super class constructor
        this.mLength = length; //assign this length
        this.mWidth = width; //assign this width
    }
    
    public double area() //calculate area of rectangle
    {
        double rectangleArea = (this.mLength * this.mWidth); // area = l * w
        return (rectangleArea); //return area value
    }
    
    public String toString() //return object's description
    {
        return (this.getColor() + " RECTANGLE with length of " + this.mLength 
                + " and width of " + this.mWidth + " and area of " + area());
    }
}
