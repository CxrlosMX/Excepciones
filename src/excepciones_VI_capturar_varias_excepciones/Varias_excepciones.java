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
        //Excepciones no controladas, esto es una mala practica de programación
        try {
            division();
        } catch (ArithmeticException e) { //Excepcion Aritmetica
            System.out.println("Estas dividiendo por cero " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("No has introducido un numero entero");
            System.out.println(e.getMessage()); //Nos informar acerca del error
            System.out.println("Se ha generado un error de tipo: " + e.getClass()); //Nos devuelve la clase que ha generado el error
        }

    }

    static void division() {
        /*
         Dentro de este programa existen dos tipo de excepciones uno de tipo Aritmetico y el otro de NumberFormat que sucede al introducir una letra
         -Ambas excepciones heredan de RunTimeException por lo que son excepciones no controladas, no es una buena practica capturar los errores con Try-catch 
         */
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el dividendo", "Dividendo", 1));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el divisor", "Divisor", 1));
        System.out.println("El resultado es: " + (n1 / n2));
    }

}
