package C14260824;

import java.util.Scanner;

public class BucleFor {
    //El bucle for ofrece en la misma sintaxis, la creación de una variable que funciona para el bucle, la condición para el término y la operación a realizar sobre la variable
    public static void main(String[] args) {
        //Variable acumuladora ; condición a evaluar; operación a realizar con la variable al dar una vuelta
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingresa un número para contar hasta el 0");
        Integer miNumero = miScanner.nextInt();

        for (int i = miNumero; i >= 0; i--) {
            System.out.println("El despegue es en " + i + " segundos");
        }

        System.out.println("Despegue!");
        //Date & Time
    }
}
