/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.instancias;
import Libro.cap02.misClases.FechaDetallada;
/**
 *
 * Gema Nataly Meraz Sánchez
 */
public class TestPersona {
    public static void main(String[] args)
    {
        Persona p1 = new Persona("Juan","21773823", new FechaDetallada(23,3,1971));
        Persona p2 = new Persona("Pedro","19234452", new FechaDetallada(12,6,1968));
        
        System.out.println(p1);
        System.out.println(p1);
        System.out.println(p1);
        
        System.out.println("---");
        
        System.out.println(p2);
        System.out.println(p2);
        
        System.out.println("---");
        
        System.out.println(p1);
        System.out.println(p1);
    }
    
}
