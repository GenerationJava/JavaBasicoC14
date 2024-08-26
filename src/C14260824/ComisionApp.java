package C14260824;

import java.util.Scanner;

public class ComisionApp {
    public static void main(String[] args) {
        //Creamos instancia de Scanner
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora de Comisiones, por favor indica el número de ventas");

        Integer ventas = miScanner.nextInt();
        String comision;

        //Si, se evalúa esto como verdadero
        if (ventas <= 10000) {
            //Se ejecuta este código
            comision = "Tienes una comisión de 0%";
        } //O, si se evalúa esto otro como verdadero
        else if (ventas > 10000 && ventas <= 50000) {
            //Se ejecuta este bloque de código
            comision = "Tienes una comisión del 10%";
        } //O, si se evalúa esta tercera condición
        else if (ventas > 50000 && ventas <= 100000) {
            //Se ejecuta este código
            comision = "Tienes una comisión del 20%";
        }   //Si es que ninguna condición se evalúa como verdadero
        else {
            //Se ejecuta este bloque
            comision = "Tienes una comisión del 30%";
        }

        System.out.println(comision);

    }

}
