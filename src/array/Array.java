
package array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
         
        
        double total=0;
        int numero;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("\033[36m==Ingrese el limite del arreglo==\033[0m");
        numero = entrada.nextInt();
        
        double [] numeros = new double [numero];
        
        for(int i=0; i<numeros.length;i++){
            System.out.println("\033[35m==Ingrese un numero==\033[0m");
            numeros[i]=entrada.nextDouble();
            total+=numeros[i];
            
        }
        System.out.println("\033[45;37mLa suma es: "+total);
    }
    
}
