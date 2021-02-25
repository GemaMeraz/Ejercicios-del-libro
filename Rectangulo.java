/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.figuras;

/**
 *
 * Gema Nataly Meraz Sánchez
 */
public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    
    public Rectangulo(double b, double h)
    {
        super("Rectangulo");
        base =b;
        altura = h;
    }
    
    public double area()
    {
        return base * altura;
    }
    
     public double getBase()
    {
        //retorna el valor de la variable dia
        return base;
    }
    
    public void setBase(double base)
    {
        // asigna el valor del parametro a la variable base
        this.base = base;
    }
    
    public double getAltura()
    {
        return altura;
    }
    
    public void setAltura(double altura)
    {
        this.altura=altura;
    }
    
    
    
}
