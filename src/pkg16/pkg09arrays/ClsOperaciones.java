/*
Clase que contiene 
 */
package pkg16.pkg09arrays;

/**
 *
 * @author Juan Pablo
 */
public class ClsOperaciones 
{
    int i;
    
    public int hallarMayor(int n, int[] numeros)
    {
        int mayor = numeros[0];
        for(i=1;i<n;i++)
            if(numeros[i] > mayor)
                mayor = numeros[i];
        return mayor;
    }
    
    public int hallarMenor(int n, int[] numeros)
    {
        int menor = numeros[0];
        for(i=1;i<n;i++)
            if(numeros[i] < menor)
                menor = numeros[i];
        return menor;
    }
    
    public int hallarSuma(int n, int[] numeros)
    {
        int suma = 0;
        
        for(i=0;i<n;i++)
            if(i % 2 == 0)
            //suma = suma + numeros[i];
            suma += numeros[i];
        return suma;
    }        
}
