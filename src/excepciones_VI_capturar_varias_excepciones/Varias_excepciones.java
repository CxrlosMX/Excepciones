/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package excepciones_VI_capturar_varias_excepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 18/08/2021
 * 
 */
public class Varias_excepciones {
    /*
    Como capturar varias excepciones en un mismo programa
    */
    public static void main(String[] args) {
        division();
    }

    static void division() {
       int n1=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el dividendo","Dividendo", 1));
       int n2=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el divisor","Divisor", 1));
        System.out.println("El resultado es: "+(n1/n2));
    }

}
