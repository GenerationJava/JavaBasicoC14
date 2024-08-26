package C14260824;

import java.util.Scanner;

public class TablaDeMultiplicar {
    //Mediante bucle for, indicar toda la tabla de multiplicar de un número ingresado
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Indica un número para conocer su tabla de multiplicar, del 1 al 10");
        Integer numeroIngresado = miScanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroIngresado + " x " + i + " = " + (numeroIngresado*i));
        }


    }
}
