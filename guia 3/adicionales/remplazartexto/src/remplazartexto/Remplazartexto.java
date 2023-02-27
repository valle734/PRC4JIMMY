/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remplazartexto;
import java.util.Scanner;

/**
 *
 * @author jimmy
 */
public class Remplazartexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
     Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto con comillas simples escapadas (\\'): ");
        String textoConComillasEscapadas = scanner.nextLine();
        String textoSinComillasEscapadas = textoConComillasEscapadas.replaceAll("\\\\'", "");
        System.out.println("Texto original: " + textoConComillasEscapadas);
        System.out.println("Texto sin comillas escapadas: " + textoSinComillasEscapadas);
        
        
    }
    
}
