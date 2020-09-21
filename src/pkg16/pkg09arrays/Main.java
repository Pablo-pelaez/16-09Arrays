/* Hacer un programa que lea un vector de tamaño n de números enteros; 
luego calcule el promedio e imprima el vector y el promedio
*/

package pkg16.pkg09arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) 
    {
        // Definir un vector
        // tipo_variable[] nombre_vector = new tipo_variable[tamano]
        Scanner thule = new Scanner(System.in);
        ClsVectores ClsVector = new ClsVectores();
        int n, numeros[];
        double prom;
        
        System.out.println("Ingrese el tamaño del vector: ");
        n = thule.nextInt();
        
        numeros = ClsVector.vectorNumeros(n);
        prom = ClsVector.promedio(n, numeros);
        
        ClsVector.imprimirVector(n, numeros);
    }
    
}
