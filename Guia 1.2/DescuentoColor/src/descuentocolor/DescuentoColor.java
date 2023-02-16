/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descuentocolor;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jimmy
 */
public class DescuentoColor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //DECLARACION
        Scanner reader = new Scanner(System.in);
        double total;
        String color;
        //color = color.toUppercase();
        int opcion = 0;

        //INGRESO VALORES
        System.out.println("Digite el total de su compra");
        total = reader.nextDouble();

        try {

            System.out.print("Digite el color de la bolita (ROJA,VERDE Y BLANCA)");
            color = reader.next().toUpperCase();

            //  String color= JOptionPane.showInputDialog("Digite el color de la bolita (ROJA,VERDE Y BLANCA");
            if (color.contains("ROJ")) {
                opcion = 1;
            }

            if (color.contains("VERDE")) {
                opcion = 2;
            }
            if (color.contains("BLANC")) {
                opcion = 3;
            }

            switch (opcion) {

                case 1:

                    System.out.println("El total con descuento es:" + total * 0.9);

                    // System.exit(0);
                    break;

                case 2:

                    System.out.println("El total con descuento es:" + total * 0.95);

                    break;
                case 3:

                    System.out.println("El total es: " + total + " Gracias por partipar");

                    break;

                default:
                    System.out.println("error al elegir color");

            }

        } catch (Exception e) {
        }

    }

}
