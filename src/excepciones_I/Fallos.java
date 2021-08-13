/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones_I;

import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 11/08/2021
 *
 */
public class Fallos {

    public static void main(String[] args) {
        int[] matriz = new int[5];
        /*
         Error en tiempo de compilación: Se generan por errores de sintaxis:
         Ejemplo;
         Olvidar poner un punto y coma
         matriz[4] = 71
         */

        matriz[0] = 5;
        matriz[1] = 38;
        matriz[2] = 15;
        matriz[3] = 92;
        matriz[4] = 71;
        matriz[5] = 81;

        /*
         Errores en tiempo de ejecución: Errores de logica
         Ejemplo: Intentar recorrer una pocision inexistente en nuestro programa
         */
        for (int i = 0; i < 5; i++) {
            System.out.println("Posición: " + i + "=" + matriz[i]);
        }

        //Petición datos personales
        String nombre = JOptionPane.showInputDialog(null, "Introduce tu nombre", "Nombre", 1);
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce tu edad", "Edad", 1));
        System.out.println("Hola " + nombre + " tienes " + edad + " años " + "El programa terminó su ejecución");

        /*
         Fallos IOException: Errores ajenos al programador, java contempla los errores
         Ejemplo:
         try { //Intenta buscar nuestra imagen
         //ruta de nuestra imagen
         imagen = ImageIO.read(miImagen);
         } catch (IOException ex) { //Si no se concreta el objetivo, Capturare la excecion
         System.out.println("La imagen no ha podido encontrarse " + ex.getMessage());
         }
         */
    }
}
