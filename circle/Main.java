/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circle;

/**
 *
 * @author yanep
 */
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4.0,"Grey", true);
        Circle circle2 = new Circle();

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println("Area of circle 1 = " +  circle1.getArea() + "   Perimeter circle 1 = " + circle1.getPerimeter());
        System.out.println("Area of circle 2 = "+ circle2.getArea() + "     Perimeter of circle 2 = " + circle2.getPerimeter());
        System.out.println(" ");

        Rectangle rectangle1 = new Rectangle(08.0, 08.0, "Yellow", false);
        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(" Area rectangle 1 = " +  rectangle1.getArea() + "     Perimeter rectangle 1 = " + rectangle1.getPerimeter());
        System.out.println(" Area rectangle 2 = "+ rectangle2.getArea() + "   Perimeter rectangle 2 = " + rectangle2.getPerimeter());
        System.out.println(" ");

        Square square1 = new Square(10.0);
        Square square2 = new Square(20.0, "Cyan", true);
        System.out.println(square1);
        System.out.println(square2);
        System.out.println("Area of square 1 = " +  square1.getArea() + "   Perimeter of square 1 = " + square1.getPerimeter());
        System.out.println("Area of square 2 = "+ square2.getArea() + "     Perimeter of square 2 = " + square2.getPerimeter());
        
    }
}