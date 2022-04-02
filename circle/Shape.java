/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circle;

/**
 *
 * @author yanep
 */
public class Shape{
// private instance variables
private boolean filled;
private String color;
/**
* Create a new Shape at default position with default color.
*/
public Shape() {
filled = true;
color = "green";
}
// 2nd constructor with given radius, but color default
public Shape(String colorIn, boolean filledIn) {
this.filled = filledIn;
this.color = colorIn;
}
// A public method for retrieving the radius
public String getColor() {
return color;
}

// A public method for computing the area of Shape
public void setColor(String colorSetIn) {
color = colorSetIn;
}
// A public method for retrieving the radius
public boolean isFilled(){
if (filled == true) {
            return true;
        }
        else {
            return false;
        }
}
// A public method for computing the area of Shape
public void setFilled(boolean filledSetIn) {
this.filled = filledSetIn;
}
/**
* Create a new square at default position with default color.
*/
@Override
public String toString(){
    String isNot ="";
if (isFilled()==false){
    isNot = "not";
}
return "A Shape with color of " + color + " and " + "isNot" + " filled. ";
}
}