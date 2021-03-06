/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones_IV_throw;

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

    public static void main(String[] args) {
        String email = JOptionPane.showInputDialog(null, "Introduce tu Email", "Email", 1);
        try {
            examinarEmail(email);
        } catch (Exception e) {
            System.out.println("Dirección Incorrecta");
        }
    }

    static void examinarEmail(String email) throws ArrayIndexOutOfBoundsException { //Indicamos al método que lanza una excepcion
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
            /*
             Con estas líneas mandamos manualmente una excepcion
             */
            //ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
            throw new ArrayIndexOutOfBoundsException();
        }
    }

}
