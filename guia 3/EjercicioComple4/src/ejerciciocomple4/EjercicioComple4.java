/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocomple4;

import java.util.Scanner;

/**
 *
 * @author jimmy
 */
public class EjercicioComple4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int npositivos = 0;
        int nnegativos = 0;
        int npares = 0;
        int nm15 = 0;
        int numerox;
        Scanner teclado = new Scanner(System.in);
        int contador = 0;

        while (contador <= 10) {
            System.out.print("Ingrese un numero entero:");
            numerox = teclado.nextInt();

            if (numerox >= 0) {
                npositivos = npositivos + 1;
            }
            if (numerox < 0) {
                nnegativos = nnegativos + 1;
            }
            if (numerox % 2 == 0) {
                npares = npares + 1;
            }
            if (numerox % 15 == 0) {
                nm15 = nm15 + 1;
            }

            contador = contador + 1;

        }
        System.out.println("Cantidad de numeros postivos: " + npositivos);
        System.out.println("Cantidad de numeros negativos: " + nnegativos);
        System.out.println("Cantidad de numeros pares: " + npares);
        System.out.println("Cantidad de numeros multiplos de 15: " + nm15);

    }
}
