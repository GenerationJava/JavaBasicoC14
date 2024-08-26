package C14260824;


import java.util.Scanner;

public class JuegoAdivinanza {

    public static void main(String[] args) {
        /****Bucle WHILE****/
        Scanner miScanner = new Scanner(System.in);

        //Generación del número al azar mediante el método random() de la clase Math
        Integer numeroAlAzar = (int) (Math.random() * 10) + 1;
        Integer numeroIngresado = 0;


        System.out.println("Adivina el número misterioso y te ganas un Iphone");
        System.out.println("El número misterioso está entre el 1 y el 10");

        /*
        //"Mientras" el númeroIngresado sea "distinto de" númeroAlAzar, se ejecuta el bloque while
        while (numeroIngresado != numeroAlAzar) {
            System.out.println("Ingresa tu número");
            numeroIngresado = miScanner.nextInt();

            if (numeroIngresado < numeroAlAzar) {
                System.out.println("Muy poco, inténtalo de nuevo");
            } else if (numeroIngresado > numeroAlAzar) {
                System.out.println("Muy alto, inténtalo de nuevo");
            }
        }*/

        /*********BUCLE Do While*********/
        do {
            //Esto se va a ejecutar por lo menos una vez sin verificar la condición
            System.out.println("Ingresa tu número");
            numeroIngresado = miScanner.nextInt();
            if (!numeroIngresado.equals(numeroAlAzar)) {
                System.out.println("Inténtalo de nuevo");
            }
        } while (!numeroIngresado.equals(numeroAlAzar));//Condición a cumplirse para que se siga ejecutando el bucle Do

        System.out.println("Te engañamos, no tenemos Iphone pero tenemos patito");




    }
}
