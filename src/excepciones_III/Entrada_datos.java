package Excepciones_III;

import java.util.*;

public class Entrada_datos {

    public static void main(String[] args) {
        // Excepciones no comprobados-RunTimeException

        System.out.println("¿Que deseas hacer?");
        System.out.println("1. Introducir datos");
        System.out.println("2. Salir del programa");

        Scanner entrada = new Scanner(System.in);

        int decision = entrada.nextInt();

        if (decision == 1) {
            try {
                pedirDatos();
            } catch (InputMismatchException e) {
                System.out.println("Introduce un valor numerico en edad " + e.getMessage());
            }

        } else {

            System.out.println("Adios");

            System.exit(0);
        }

        entrada.close();

    }

    static void pedirDatos() throws InputMismatchException { //Si nuestro método va bien conseguira el objetivo por otro caso, lanzaria una excepcion-InputMismatchException 
        //Creamos un try-catch para prevenir errores en nuestro codigo
        //Realizar esto no es una muy buena practica debido a que programador debe buscar una solución
        //  try {//Con esto evitamos que nuestro programa se caiga
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre, por favor");

        String nombre_usuario = entrada.nextLine();

        System.out.println("Introduce edad, por favor");

        int edad = entrada.nextInt();

        System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + (edad + 1) + " años");

        entrada.close();
        //Si el método sale mal nos lanza este mensaje
        // } catch (InputMismatchException e) {
        //   System.out.println("Introduce un valor numerico en edad "+e.getMessage());
        // }
        System.out.println("Hemos terminado");

    }

}
