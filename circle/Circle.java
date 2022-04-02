/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circle;

/**
 *
 * @author yanep
 */
/**
* The Circle class models a circle with a radius and color.
*/
public class Circle extends Shape { // Save as "Circle.java"
 // private instance variable, not accessible from outside this class
private double radius;
 // Constructors (overloaded)
 /** Constructs a Circle instance with default value for radius and color */
 public Circle() { // 1st (default) constructor
 super();
 radius = 1.0;
 }
 /** Constructs a Circle instance with the given radius and default color */
 public Circle(double radius) { // 2nd constructor
 super();
 this.radius = radius;
 }
 public Circle(double redius, String color, boolean filled){
    super (color, filled);
    this.radius = radius; 
 }
 /** Returns the radius */
 public double getRadius() {
 return radius; 
 }
//Getter and Setter
public void setRadius(double radius) {
        this.radius = radius;
    }
 //Methods
public double getArea() {
 return radius*radius*Math.PI;
 }
 public double getPerimeter(){
     return 2 * Math.PI *radius;
  }
 @Override
 public String toString() {
 return "Circle[radius=" + radius + ", which is a subclass of" + super.toString() +"]";
 }
 
}