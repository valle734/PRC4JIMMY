/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;
import java.util.Scanner;

/**
 *
 * @author jimmy
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner teclado=new Scanner(System.in);
int x,suma,valor,promedio;
x=1;
suma=0;
while (x<=10) {
System.out.print("Ingrese un valor:");
valor=teclado.nextInt();
suma=suma+valor;
x=x+1;
}
promedio=suma/10;
System.out.print("La suma de los 10 valores es:");
System.out.println(suma);
System.out.print("El promedio es:");
System.out.print(promedio);
    
    }
    
}
