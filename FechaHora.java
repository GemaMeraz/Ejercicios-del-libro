/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.misClases;

/**
 *
 * Gema Nataly Meraz Sánchez
 */
public class FechaHora extends FechaDetallada{
    
    private int hora;
    private int minuto;
    private int segundo;
    
    public FechaHora(String sFecha,int hora,int min,int seg)
    {
        super(sFecha);
        this.hora = hora;
        this.minuto = min;
        this.segundo = seg;
    }
    
    public String toString()
    {
        // invocamos al metodo toString de nuestro padre
        return super.toString()+ " ("+hora+":"+minuto+":"+segundo+")";
    }
    
     public int getHora()
    {
        //retorna el valor de la variable hora
        return hora;
    }
    
    public void setHora(int hora)
    {
        // asigna el valor del parametro a la variable hora
        this.hora = hora;
    }
    
    public int getMinuto()
    {
        return minuto;
    }
    
    public void setMinuto(int minuto)
    {
        this.minuto=minuto;
    }
    
    public int getSegundo()
    {
        return segundo;
    }
    
    public void setSegundo(int segundo)
    {
        this.segundo = segundo;
    }
    
    public FechaHora(){}
    
}
