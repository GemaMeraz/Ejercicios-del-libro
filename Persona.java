/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.instancias;
import Libro.cap02.fechas.Fecha;
import Libro.cap02.misClases.FechaDetallada;
/**
 *
 * Gema Nataly Meraz Sánchez
 */
public class Persona {
    private String nombre;           // atributo
    private String dni;              // atributo
    private Fecha fechaNacimiento;   // atributo
    
    private int cont=0;              // variable de estado          
    
    public Persona(String nombre, String dni, Fecha fecNac)
    {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fecNac;
    }
    
    public String toString()
    {
        cont++;
        return nombre + ", DNI: "+ dni+", nacido el: "+ fechaNacimiento+" ("+ cont +")";
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    public String getDni()
    {
        return dni;
    }
    
    public void setDni(String dni)
    {
        this.dni=dni;
    }
    
    public Fecha getFechaNacimiento()
    {
        return fechaNacimiento;
    }
    
    public void setFechaNacimiento(Fecha fechaNacimiento)
    {
        this.fechaNacimiento=fechaNacimiento;
    }
}
