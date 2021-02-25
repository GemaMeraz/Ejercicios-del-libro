/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.colecciones;
import java.util.Scanner;
/**
 *
 * Gema Nataly Meraz Sánchez
 */
public class TestMiColeccion {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        
        // instancio una MiColeccion "especializada" en String
        MiColeccionT<String> mc = new MiColeccionT<String>(5);
        // creo una coleccion con capacidad inicial = 5
       // MiColeccion mc = new MiColeccion(5);
        
        // leo el primer nombre
        System.out.println("Ingrese Nombre: ");
        String nom=scanner.next();
        
        while( !nom.equals("FIN") )
        {
            // inserto siempre en la posicion 0
            mc.insertar(nom,0);
            
            // leo el siguiente nombre
            nom=scanner.next();
        }
        
        String aux;
        
        // recorro la coleccion y tomo cada uno de sus elementos
        for(int i=0; i<mc.cantidad(); i++ )
        {
            // el metodo obtener retorna un Object entonces
            // entonces tengo que castear a String
            aux = (String) mc.obtener(i);
            
            System.out.println(aux +" - "+aux.length()+" caracteres");
        }
    }
}
