/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.misClases;
import Libro.cap02.fechas.Fecha;
/**
 *
 * @author Usuario
 */
public class FechaDetallada extends Fecha{
     private static String meses[] ={"Enero","Febrero","Marzo",
    "Abril","Mayo","Junio","Julio","Agosto","Septiembre","octubre",
    "noviembre","diciembre"};
    
    public FechaDetallada(int dia, int mes, int anio)
    {
     // invocamos al constructor del padre
        super(dia,mes,anio);
    }
    
    public FechaDetallada(String s)
    {
        // invocamos al constructor del padre
        super(s);
    }
    
    
    public FechaDetallada()
    {
        // invocamos al constructor del padre
        //super();
        
        // invocamos al constructor de tres int pasando ceros
        this(0,0,0);
    }
    
     public String toString()
    {
        return getDia()+" de "+meses[getMes()-1]+" de "+getAnio();
    }
     
     
}
