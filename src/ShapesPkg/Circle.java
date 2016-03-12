/* 
 * Author: Dalton C. Okechukwu
 *
 * Course: INFO.297 Assignment Six
 * 
 * About: Class that extends Shape. Derived class for Circle Shape object.
 * 
 * Date: 02-29-2016
 */
package ShapesPkg;

/**
 * @author Chike
 */
public class Circle extends Shape
{
    private double mRadius; //instance variable, radius
    
    public Circle(String color, double radius) // constructor that invokes 
            //the base constructor (passing the color), then sets the radius 
            //instance value
    {
        super(color); //call super class constructor
        this.mRadius = radius; //assign this radius
    }
    
    public double area() //calculate area of a circle
    {
        double circleArea = Math.PI * Math.pow(this.mRadius, 2); //PI * r^2
        return (circleArea); //return circle area
    }
    
    public String toString() //return object's description
    {
        return (this.getColor() + " CIRCLE with radius of " + this.mRadius 
                + " and area of " + area());
    }
}