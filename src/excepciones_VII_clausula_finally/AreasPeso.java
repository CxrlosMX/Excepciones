/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones_VII_clausula_finally;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 21/08/2021
 *
 */
public class AreasPeso {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Elije una opcion:\n1. Cuadrado\n2. Rectangulo\n3. "
                + "Triángulo\n4. Círculo");
        try {
            //No es muy recomendable cerrar el Scanner aqui por que al ocurrir una excepción no se cerrara y consumremos recursos
            figura = entrada.nextInt();
            //entrada.close();//Cerramos nuestra consola para liberar recursos
        } catch (InputMismatchException e) {
            System.out.println("Ha ocurrido un error");
        } finally { //La claula finally siempre se ejecutara tanto si se lanza la excepicion tanto si no
            entrada.close();//Cerramos nuestra consola para liberar recursos
        }

        switch (figura) {

            case 1:

                int lado = Integer.parseInt(JOptionPane.showInputDialog("In"
                        + "troduce el lado:"));
                System.out.println(Math.pow(lado, 2));

                break;

            case 2:

                int base = Integer.parseInt(JOptionPane.showInputDialog("In"
                        + "troduce la base:"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("In"
                        + "troduce la altura: "));

                System.out.println("El área del rectángulo es: " + base * altura);

                break;

            case 3:

                base = Integer.parseInt(JOptionPane.showInputDialog("In"
                        + "troduce la base:"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("In"
                        + "troduce la altura: "));

                System.out.println("El área del triángulo es: "
                        + (base * altura) / 2);

                break;

            case 4:

                int radio = Integer.parseInt(JOptionPane.showInputDialog("In"
                        + "troduce el radio: "));
                System.out.println("El área del círculo es: ");
                System.out.println(Math.PI * (Math.pow(radio, 2)));

                break;

            default:
                System.out.println("La opción no es correcta.");
        }
        //-----------------------------------------------------------------------------

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce "
                + "tu altura en cm: "));

        System.out.printf("Si eres hombre tu peso ideal es: %d kg.", altura - 110);
        System.out.printf("\nSi eres mujer tu peso ideal es: %d kg.", altura - 120);

    }
    static int figura = 0;
}
