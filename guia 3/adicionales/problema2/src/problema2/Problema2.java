/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;
import java.util.Scanner;

/**
 *
 * @author jimmy
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado=new Scanner(System.in);
int n,contador;
System.out.print("Ingrese el valor final:");
n=teclado.nextInt();
contador=1;
while (contador<=n) {
System.out.print(contador);
System.out.print(" - ");
contador = contador + 1;
}
        
    
    }
    
}
