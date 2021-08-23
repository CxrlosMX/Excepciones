/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Debugging_I;

import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 22/08/2021
 *
 */
public class Aleatorios {

    public static void main(String[] args) {
        /*
        Depurar: Ver linea a linea el proceso que realiza
        1.-Creamos puntos de interrupción, lo que hace es hacer una pausa en el punto señalado
        */
        int elementos = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce elementos de la matriz", "Introduciendo Elementos", 1));
        int num_aleat[] = new int[elementos];
        for (int i = 0; i < num_aleat.length; i++) {
            //Podemos agregar condiciones en nuestros puntos de interrupción
            num_aleat[i] = (int) (Math.random() * 100); //Creamos puntos de interrupción
        }
 
        for (int elem : num_aleat) {
            System.out.println(elem);
        }
    }
}
