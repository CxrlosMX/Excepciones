/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones_II_throws_try_cath;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 12/08/2021
 *
 */
public class Leer_Imagenes {

    public static void main(String[] args) {
        MarcoImagen marco = new MarcoImagen();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoImagen extends JFrame {

    public MarcoImagen() {
        setVisible(true);
        setTitle("Marco con imagen");
        setBounds(500, 150, 500, 500);
        LaminaConImagen milamina = new LaminaConImagen();
        add(milamina);
    }
}

class LaminaConImagen extends JPanel {

    public LaminaConImagen() {
        //EXCEPCION COMPROBADA-IOException, todas las excepciones comprobadas heredan de IOException
        try { //Intenta
            //Leemos nuestra imagen
            imagen = ImageIO.read(new File("recursos/imagen.jpg"));
            /* Este método lanza una excepcion IOException, por lo que el programa Java nos obliga a construir una estructura try-catch*/
        } catch (IOException e) { //Si no logramos el objetivo hacemos esto:
            System.out.println("Imagen no encontrada");
        }
    }

    @Override
    public void paintComponent(Graphics g) throws NullPointerException {
        super.paintComponent(g);
        /*
         EXCEPCION NO COMPROBADA-RunTimeException-Excepciones que el programador debe controlar
         Debemos hacer modificaciónes a nuestro codigo, debido a que si no encuentra la imagen
         al intentar obtener el ancho y alto de la imagen el valor de imagen es Null por lo  que
         nos arrojaria un error
         */
        /*try {
         int anchura = imagen.getWidth(this);
         int altura = imagen.getHeight(this);
         g.drawImage(imagen, 0, 0, null);
         } catch (NullPointerException e) {
         g.drawString("No encontrada", 10, 10);
         }*/
        if (this.imagen != null) {
            int anchura = imagen.getWidth(this);
            int altura = imagen.getHeight(this);
            g.drawImage(imagen, 0, 0, null);
        } else {
            g.drawString("No se ha podido cargar la imagen", 10, 10);

        }
    }
    private Image imagen;

}
