/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap01;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class DemoMatriz {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de filas: ");
        int n= scanner.nextInt();
        
        System.out.println("Ingrese la cantidad de columnas: ");
        int m= scanner.nextInt();
        
        // creo una matriz de n filas x columnas
        int mat[][]=new int[n][m];
        
        int nro;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                // genero un número aleatorio entre 0 y 1000
                nro=(int)(Math.random()*1000);
                
                // asigno el número en la  matriz
                mat[i][j]=nro;
            }
        }
        
         for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                // imprimo la celda de la matriz
                System.out.println(mat[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
}
