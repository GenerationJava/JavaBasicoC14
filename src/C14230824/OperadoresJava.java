package C14230824;

import java.util.Scanner;

public class OperadoresJava {

    public static void main(String[] args) {
        //System.out.println("Hola mundo");
        //Creamos nuestra instancia de Scanner para poder solicitar datos por consola
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora");
        /*
        System.out.println("Indica el primer número");
        Integer numeroUno = miScanner.nextInt();

        System.out.println("Indica el segundo número");
        Integer numeroDos = miScanner.nextInt();


        miScanner.nextLine();
        */

        /***OPERADORES ARITMÉTICOS***/
        //+ - * / %
        /*

        Integer resultadoSuma = numeroUno + numeroDos;
        Integer resultadoResta = numeroUno - numeroDos;
        Integer resultadoMultiplicacion = numeroUno * numeroDos;
        Integer resultadoDivision = numeroUno / numeroDos;

        System.out.println("El resultado de la suma entre " + numeroUno + " y " + numeroDos + " es igual a " + resultadoSuma);
        System.out.println("Resta = " + resultadoResta + '\n' + "Multiplicación " + resultadoMultiplicacion  + '\n' + "Division = " + resultadoDivision);

        Integer resto = numeroUno % numeroDos;
        System.out.println("El resto de la división es " + resto);
        */


        /**OPERADORES DE ASIGNACIÓN**/
        // = =+ =- =* = ++ --/

        /*
        System.out.println("El resultado de la asignación es " + (numeroUno+=numeroDos));
        //Preincremento, sucede al momento de leer la instrucción
        System.out.println("El preincremento es " + ++numeroUno);
        //Posincremento, sucede de manera posterior
        System.out.println("El posincremento es " + numeroUno++);
        System.out.println("Ahora numeroUno equivale a " + numeroUno);
        */

        /*****OPERADORES DE COMPARACIÓN*****/
        // == < > !=
        System.out.println("Inserta una palabra");
        String palabraUno = miScanner.nextLine();
        System.out.println("Di otra palbra");
        String palabraDos = miScanner.nextLine();
        /*

        Boolean igualdadNumeros = numeroUno == numeroDos;
        Boolean igualdadPalabras = palabraUno == palabraDos;


        System.out.println("Los números son iguales? " + igualdadNumeros);
        System.out.println("Las palabras son iguales? " + igualdadPalabras);

        Boolean esMayor = numeroUno > numeroDos;
        Boolean esMenor = numeroUno < numeroDos;
        Boolean esDistinto = numeroUno != numeroDos;
        */

        /*
        System.out.println("La primera comparación da como resultado " + esMayor + '\n' + "la segunda tuvo como resultado " + esMenor + '\n' + "La tercera tuvo como resultado " + esDistinto );
         */

        /*****OPERADORES LÓGICOS****/
        boolean combinacionDeCondiciones = ((5 > 4) && (10 < 20));
        //System.out.println("La expresión es " + combinacionDeCondiciones);
        boolean combinacionDePosibilidades = (palabraUno.equals("Hola") || palabraDos.equals("Mundo"));
        //System.out.println("La expresion ahora es "+ combinacionDePosibilidades);
        boolean inversionDeResultado = !true;
        //System.out.println(inversionDeResultado);


        /**CONTROL DE FLUJO**/
        //If - else if - else
        boolean comprobacion = palabraUno.equals("Hola");
        if (comprobacion) {
            //Bloque a ejecutarse si la condición se evalúa true
            System.out.println("las palabras son iguales");
        } else {
            //Bloque a ejecutarse si la condición se evaluá false
            System.out.println("las palabras son distintas, te dy otra oportunidad");
            palabraUno = miScanner.nextLine();

            //Bloque if anidado
            if (palabraUno.equalsIgnoreCase("hola")) {
                System.out.println("Al fin, estaba esperando que me saludaras");
            } else {
                System.out.println("Chaooo");
            }
        }

        //JUEGO ADIVINANZA
        //Math.random() método que genera un número al azar entre 0 y 1
        Integer numeroAlAzar = (int) (Math.random() * 10) + 1;

        System.out.println("Adivina el número del 1 al 10");
        Integer numeroEscogido = miScanner.nextInt();

        if (numeroAlAzar == numeroEscogido) {
            System.out.println("Felicidades, ganaste un patito");
        } else if ( numeroEscogido < numeroAlAzar) {
            System.out.println("Muy bajo");
        } else {
            System.out.println("Muy alto");
        }

        //DIAS DE LA SEMANA
        System.out.println("Indica un número del 1 al 7 y te diré que día de la semana es");
        Integer numeroDia = miScanner.nextInt();

        switch (numeroDia) {
            case 1:
                System.out.println("El lunes es el peor día de la semana");
                break;
            case 2,3,4:
                System.out.println("La mitad de la semana no es tan mala");
                break;
            case 5:
                System.out.println("El viernes es mejor");
                break;
            default:
                System.out.println("Los fines de semana son lo máximo");
                break;
        }

        //OPERADOR TERNARIO
        String mensajeAMostrar = numeroDia == 1 ? "El lunes ya va a terminar" : "Es otro día de la semana";
        System.out.println(mensajeAMostrar);


    }
}
