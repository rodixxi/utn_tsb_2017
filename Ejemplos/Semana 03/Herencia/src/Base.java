/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author federico
 */
public class Base {
    
   
    private int a;
    protected int b;

    public Base(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Base(int a) {
        this.a = a;
    }

    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    
    
}
