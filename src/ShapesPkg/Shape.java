/* 
 * Author: Dalton C. Okechukwu
 *
 * Course: INFO.297 Assignment Six
 * 
 * About: Root of Shape class heirarchy, serves as base class for the other 
 * shapes.
 * 
 * Date: 02-29-2016
 */
package ShapesPkg;
/**
 * @author Chike
 */
public class Shape 
{
    private String mColor; //string instance variable
    
    public Shape(String color) //constructor that sets the color instance value
    {
        this.mColor = color; //assign color
    }
    
    public String getColor() //mthod to return the object's color value
    {
        return (this.mColor.toUpperCase()); //return in upper case for emphasis
    }
    
    public double area() //method tie return object's area. Must be overridden 
            // in each derived class. Return zero for base Shape class.
    {
        return(0.0);
    }
    
    public String toString() //method to return teh object's description
            // (color, type, dimensions and area) as a String. Must be 
            //overrridden in each derived class.
    {
        return("GENERIC SHAPE");
    }
}