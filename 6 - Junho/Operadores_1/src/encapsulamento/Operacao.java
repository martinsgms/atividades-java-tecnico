/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

import javax.swing.JOptionPane;

public class Operacao {
private double v1, v2;

    public double getV1() {
        return v1;
    }

    public double getV2() {
        return v2;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public void setV2(double v2) {
        this.v2 = v2;
    }
     public double somar(){
        //return getV1() + getV2();   
        double PI = 3.14;
        return PI;
        
    
    }
    
    public double subtrair(){
        return getV1() - getV2();
    }
    
    public double multiplicar(){
        return getV1() * getV2();
    }
    
    public double dividir(){
        return getV1() / getV2();
    }
    
}
