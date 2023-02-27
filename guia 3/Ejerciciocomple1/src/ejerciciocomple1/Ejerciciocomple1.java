/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocomple1;
import java.util.Scanner;

/**
 *
 * @author jimmy
 */
public class Ejerciciocomple1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 int n;
 int x =1;
 int resultado;
 Scanner teclado=new Scanner(System.in);
        
System.out.print("Ingrese un valor a buscar multiplicaciones:");       
n=teclado.nextInt();
 while (x<=10) {
resultado = n*x;
System.out.println("La multiplicacion de " +n+ " por " +x+  " es: " +resultado);
x=x+1;
}
    
    
    
    }
    
}
