/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.instancias;

/**
 *
 * Gema Nataly Meraz Sánchez
 */
public class X {
    private int a;
    private int b;
    
    public X(int a, int b)
    {
        this.a= a;
        this.b=b;
    }
    
    public String toString()
    {
        return "("+a+","+b+")";
    }
    
    public int getA()
    {
        return a;
    }
    
    public void setA(int a)
    {
        this.a=a;
    }
    
    public int getB()
    {
        return b;
    }
    
    public void setB(int b)
    {
        this.b = b;
    }
}
