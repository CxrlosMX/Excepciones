/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones_V_creacion;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 16/08/2021
 *
 */
public class VerificarEmail {
    /*
     Creamos nuestra propia Excepcion
     */

    public static void main(String[] args) {
        String email = JOptionPane.showInputDialog(null, "Introduce tu Email", "Email", 1);
        try {
            //try {
            examinarEmail(email);
            //} catch (Exception e) {
            //     System.out.println("Dirección Incorrecta");
            //}

        } catch (Longitud_email ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace(); //Con esto imprimes la llamada del error desde la pila de la excepción
        }
    }

    static void examinarEmail(String email) throws Longitud_email { //Indicamos al método que lanza una excepcion
        int arroba = 0;
        boolean punto = false;
        if (email.length() > 3) {
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    arroba++;
                }
                if (email.charAt(i) == '.') {
                    punto = true;
                }
            }
            if (punto && arroba > 0) {
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto");
            }
        } else {
         
            throw new Longitud_email("El Email es demaciado corto");
            /*
             Con estas líneas mandamos manualmente una excepcion
             */
            //ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
            //throw new ArrayIndexOutOfBoundsException();
        }
    }

}
/*
 Para crear nuestra propia excepcion debemos crear una clase que herede de Exception o IOException, RuntimeException
 */

class Longitud_email extends Exception {

    /*
     -Las clases que heredan de Exception deben tener dos constructores, constructor por defecto y constructor con parametros
     */
    public Longitud_email() {
    }

    public Longitud_email(String msj_error) {
        super(msj_error); //Con esta instruccion mandamos a llamar al constructor de la clase padre
    }
}
