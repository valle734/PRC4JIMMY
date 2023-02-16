/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero.divisible;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author jimmy
 */
public class NumeroDivisible {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner reader = new Scanner(System.in);
        double n1,n2;
        
        
        
        System.out.println("Digite el primer numero");
        n1 = reader.nextDouble();
        System.out.println("Digite el segundo numero");
        n2 = reader.nextDouble();
        
        if(n1%n2 ==0)
        {
        System.out.println("Los numeros son divisibles");
        }
        else{
        System.out.println("Los numeros no son divisibles");
            }
        
        
        
        
    }
    
}
