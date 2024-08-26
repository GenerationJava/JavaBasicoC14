package C14260824;

import java.util.Scanner;

public class BucleDoWhile {
    // El bucle do while, va a ejecutar el bloque de código por lo menos una vez incluso si la condición se evalúa como false
    public static void main(String[] args) {
        //Menú para calculadora
        Scanner miScanner = new Scanner(System.in);
        Integer opcion = -1;

        do {
            //Este bloque se ejecuta por lo menos una vez, aunque la condición en el while sea false
            System.out.println("Ingresa una opción");
            System.out.println("0 - Salir \n 1 - Sumar \n 2 - Restar \n 3 - Multiplicar \n 4 - Dividir"  );
            opcion = miScanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma es ");
                    break;
                case 2:
                    System.out.println("La resta es ");
                    break;
                case 3:
                    System.out.println("La multiplicación es");
                    break;
                case 4:
                    System.out.println("El resultado de la división es");
                    break;
                default:
                    System.out.println("Saliste de la calculadora, ingresa una nueva opción");
            }
            //Luego de ejecutar el bloque Do por lo menos una vez, evalúa la condición, si es true sigue ejecutando el bloque
        } while (opcion < 0 || opcion > 4);

    }
}
