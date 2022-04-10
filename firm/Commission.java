/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firm;

/**
 *
 * @author yanep
 */
public class Commission extends Hourly {
    double totalSales;
    double comRate; 
    
    public Commission(String eName, String eAddress, String ePhone, String socSecNum, double rate, double comrate){
        super(eName, eAddress, ePhone, socSecNum, rate );
        comRate = comrate;
    }
    public void addSales(double totalSales){
        this.totalSales += totalSales;
    }
    public double pay(){

        double payment = super.pay() + (this.totalSales * comRate);
        this.totalSales = 0;
        return payment;
        
    }

    @Override

    public String toString(){
        String result = super.toString();
        
        result += "\nTotal Sales: " + totalSales;

        return result;
    }
}