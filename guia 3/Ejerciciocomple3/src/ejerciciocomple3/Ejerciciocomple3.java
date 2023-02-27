/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocomple3;
import java.util.Scanner;

/**
 *
 * @author jimmy
 */
public class Ejerciciocomple3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int cantidad=0;
    int x=1;
    int lado_a;
    int lado_b;
    int lado_c;
    int nequilatero=0;
    int nisosceles=0;
    int nescaleno=0;
    Scanner teclado=new Scanner(System.in);
    
    System.out.print("Ingrese la cantidad de trinagulos a ingresar:");       
    cantidad=teclado.nextInt();    
    
    try {
                
         
    while(x <= cantidad){
    System.out.print("Ingrese valor lado A:");       
    lado_a=teclado.nextInt();
    System.out.print("Ingrese valor lado B:");       
    lado_b=teclado.nextInt();
    System.out.print("Ingrese valor lado C:");       
    lado_c=teclado.nextInt();
    
    if(lado_a == lado_b && lado_b ==lado_c)
    {
    nequilatero = nequilatero+1;
    }
    if((lado_a == lado_b && lado_b != lado_c) || (lado_a == lado_c && lado_c != lado_b) || (lado_b == lado_c && lado_c != lado_a) )
    {
        nisosceles = nisosceles+1;
    }
    if(lado_a != lado_b && lado_b != lado_c)
    {
    nescaleno= nescaleno+1;
    }
    
    
    x=x+1;
    }
        }catch (Exception e) {
        }
    System.out.println("La cantidad de triangulos equilateros es: " + nequilatero);
    System.out.println("La cantidad de triangulos isosceles es: " + nisosceles);
    System.out.println("La cantidad de triangulos escalenos es " + nescaleno);
    
            if (nequilatero < nisosceles) {
            if (nequilatero < nescaleno) {
                System.out.println("El menor es: equilatero "  );
            } else {
                System.out.println("El menor es : escaleno "  );
            }
        } else {
            if (nisosceles < nescaleno) {
                System.out.println("El menor es: isosceles" );
            } else {
                System.out.println("El menor es: escaleno"  );
            }
    
    
    
    
    
    
            } 
    
    }
    
}
