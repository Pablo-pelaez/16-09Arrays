/*
Clase que contiene métodos para leer e imprimir un vector de tamao N de números enteros 
y el promedio de sus elementos.
 */
package pkg16.pkg09arrays;
import java.util.Scanner;

public class ClsVectores
        
{
    Scanner thule = new Scanner(System.in);
    int i;
    public int[] vectorNumeros(int n)
    {
        int[] numeros = new int[n];
        for(i=0; i<n; i++)
        {
            System.out.println("Digite elemento " + i + " ");
            numeros[i] = thule.nextInt();
        }
        return numeros;
    }
    
    public double promedio(int n, int[] numeros)
    {
       double acum = 0, prom;
       
       for(i=0; i<n; i++)
       {
           acum = acum + numeros[i];
       }
       prom = acum / n;
       return prom;
    }
    
    public void imprimirVector(int n, int[] numeros)
    {
        double promed=0;
        System.out.println("\nElementos del vector");
        for(i=0;i<n;i++)
        {
            ClsVectores prome = new ClsVectores();
            promed = prome.promedio(n, numeros);
            
            System.out.print(numeros[i] + ", ");
        }
        System.out.println("\nEl promedio de los números es: " + promed);
    }
}
