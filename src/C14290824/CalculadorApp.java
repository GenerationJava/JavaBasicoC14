package C14290824;

import java.util.Scanner;

public class CalculadorApp {

    //Métodos para la calculadora

    //Indica el tipo de dato a retornar que es Integer
    public static Integer suma(int a, int b) {
        return a + b;
    }

    //Un método void no retorna ningún valor, por eso no lleva la palabra reservada return
    public static Integer resta(int a, int b) {
        //Variable para el scope del método
        int resultado = a-b;
        //Este método ejecuta una acción, imprimir la resta de los dos números
        return a-b;
    }


    public static Integer multiplicar(int a, int b) {
        return a * b;
    }

    public static Double dividir(double a, double b) {
        return a / b;
    }

    public static void mostrarMenu() {
        System.out.println("Selecciona una opción \n 1- Sumar \n 2- Restar \n 3- Multiplicar \n 4- Dividir " );
    }


    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);
        //Declaro las variables que voy a usar en el programa
        Integer numUno;
        Integer numDos;
        Integer opcion;

        //Primero, mostramos el menú de opciones
        mostrarMenu();

        //Inicializamos los valores númericos con lo que traiga el scanner
        System.out.println("Ingresa el primer número");
        numUno = miScanner.nextInt();
        System.out.println("Ingresa el segundo número");
        numDos = miScanner.nextInt();

        //Inicializamos la opción con lo que ingrese el usuario
        System.out.println("Ingresa la opción acá");
        opcion = miScanner.nextInt();

        //switch evalúa lo que se indique en opción y según el caso muestra el resultado de la operación
        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es " + suma(numUno, numDos));
                break;
            case 2:
                System.out.println("El resultado de la resta es " + resta(numUno, numDos));
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es " + multiplicar(numUno, numDos));
                break;
            case 4:
                System.out.println("El resultado de la división es " + dividir(numUno, numDos));
                break;
            default:
                System.out.println("Ingresa una opción valida");
                break;

        }


        /*
        Integer resultadoSuma = suma(numUno,numDos);
        System.out.println("El llamado al método suma, que pertenece a la clase, entregó como resultado " + suma(5,5));
        System.out.println("El valor de la variable resultadoSuma es "+ resultadoSuma);*/


    }
}
