/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overload;

/**
 *
 * @author yanep
 */
public class Overload {

void demo(int a){
    System.out.println("a: " + a);
}
void  demo (int a, int b){
    System.out.println("a and b: " + a +","+ b);
}  
double demo(double a){
    System.out.println("double a: " + a);
    return a*a;
}
}
