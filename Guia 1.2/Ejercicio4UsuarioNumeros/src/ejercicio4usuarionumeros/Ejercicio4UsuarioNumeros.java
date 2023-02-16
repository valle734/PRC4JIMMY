/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4usuarionumeros;

import javax.swing.JOptionPane;

/**
 *
 * @author jimmy
 */
public class Ejercicio4UsuarioNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String leer;
        String leer2;
       
        
        double ncantidad, numerox, mayor = 0, menor = 10000;
        int i = 1, contador = 0;
        leer = JOptionPane.showInputDialog("Ingrese la cantidad de numeros a ingresar ");
        ncantidad = Double.parseDouble(leer);

        while (i <= ncantidad) {

            leer2 = JOptionPane.showInputDialog("Numero: " + "(" + i + ")" + " ingrese su valor");
            numerox = Double.parseDouble(leer2);
            //VALIDACION DE SUELDO NEGATIVO
            if (numerox < 0) {
                JOptionPane.showMessageDialog(null, "ERROR, SUELDO NEGATIVO");
            } else {
                
                if (numerox %2 == 0){
                contador = contador +1;   
                }
                if (numerox > mayor) {
                    mayor = numerox;
                }
                if (numerox < menor) {
                    menor = numerox;
                }

                
                i = i + 1;
            }
        }
        JOptionPane.showMessageDialog(null, " El numero Mayor es : " + mayor
                + "\nEl numero Menor es de : " + menor
                + "\n" + contador + " numeros de " + (i - 1) + " son pares");

    }

}
