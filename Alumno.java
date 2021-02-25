/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.interfaces;

/**
 *
 * @author Usuario
 */
public class Alumno implements Comparable<Alumno> {
    
    private String nombre;
    private int edad;
    private double notaPromedio;
    
    // constructor
    public Alumno(String nom, int e, double np)
    {
        this.nombre = nom;
        this.edad = e;
        this.notaPromedio = np;
    }
    
    // metodo heredado de la interface Comparable
    public int compareTo(Alumno otroAlumno)
    {
        return this.edad - otroAlumno.edad;
    }
    
    public String toString()
    {
        return nombre+", "+edad+", "+notaPromedio;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    public int getEdad()
    {
        return edad;
    }
    
    public void setEdad(int edad)
    {
        this.edad=edad;
    }
    
    public double getNotaPromedio()
    {
        return notaPromedio;
    }
    
    public void setNotaPromedio(double notaPromedio)
    {
        this.notaPromedio = notaPromedio;
    }
}
