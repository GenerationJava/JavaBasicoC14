import C14290824.CalculadorApp;
import C14300824.Perro;

import java.util.Scanner;

public class Main {

    static String saludo = "Hola";
    String variableInstancia = "Hola necesitas instaciar Main para verme";

    //Es el punto de entrada al programa, quiere decir que el JVM va a buscar a la clase donde esté el método main
    public static void main(String[] args) {
        /***************** COMENTARIOS EN JAVA ********************/
        // <- Este es un comentario de línea
        /* <- Este es un comentario de bloque
         */
        /**
         * <- Este es otro comentario de bloque y se suele usar para separar secciones
         * **/
        /***********************************************************/

        /********** MÉTODOS PARA INPUT Y OUTPUT EN CONSOLA *********/
        /*Llama a la clase System y a su método println, para imprimir un texto con salto de línea
        Este método se usa para debugear a través de consola, un atajo es escribir sout*/
        System.out.println("Hola mundo, soy Poochie");

        //Creo una variable de clase Scanner, lo declaro:
        Scanner scannerHP = new Scanner(System.in);
        //Tipo de dato (Clase) + nombre de variable = nueva instancia de la clases(Recibe datos de entrada con System.in)

        /*Para hacer uso de mi Scanner scannerHP lo llamo en la inicialización de otra variable
        Declarar e inicializar una variable*/
        System.out.println("Indica tu nombre");
        String nombre = scannerHP.nextLine();
        System.out.println("Mucho gusto " + nombre);
        /***********************************************************/

        /***************** TIPOS DE DATO EN JAVA********************/
        /*PRIMITIVOS*/
        //Los números enteros son tratados como int por defecto

        byte numeroPequenito = 127; // -128 a 127 - 1byte = 8bits
        short numeroPequeno = 32767; // -32768 a 32767 - 2 = 16bits
        int entero = 2147483647; //-2,147,483,648 to 2,147,483,647 - 4bytes = 32bits
        long numeroGrande = 9223372036854775807L; //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float decimal = (float) 3.14; //Hasta 7 decimales - 4bytes = 32bits
        double decimalGrande = 3.14; // Hasta 16 decimales - 8bytes = 64bits
        boolean condicional = true; // 1byte
        char caracter = 'A'; //Funciona con UNICODE como estándar no ASCII - 2bytes

        /*CASTEAR ES HACER UNA CONVERSIÓN DE MANERA IMPLÍCITA y EXPLÍCITA

        /*TIPO OBJETO*/
        //Este tipo de dato hace refencia a un lugar en memoria
        String cadenaDeTexto = "Hola mundo";
        Byte numeroPequenitoObjeto = 127;// El tipo objeto, refencia, wrapper
        Integer enteroObjeto = 3123; // El wrapper de int se llama Integer

        /*ENUM(TIPO DATO ESPECIAL)*/
        enum diasDeLaSemana {
            LUNES,
            MARTES,
            MIERCOLES,
            JUEVES,
            VIERNES
        }

        /*ARREGLOS ESTÁTICOS*/
        byte[] arregloDeEnteros = {1, 2, 3};
        /***********************************************/
        /*TIPOS DE VARIABLE*/
        //Variables de clase
        System.out.println(saludo);

        //Variable de instancia
        Main miMain = new Main();
        System.out.println(miMain.variableInstancia);

        //Variable de clase para perro

        System.out.println("El perro tiene " + " patas");

        //Variable de instancia para perro
        Perro nuevoPerro = new Perro();
        /*
        nuevoPerro.nombre = "Firulais";
        System.out.println("El perro se llama " + nuevoPerro.nombre);*/
        System.out.println("El perro tiene " + nuevoPerro.getNumeroOrejas() + " orejas");
        nuevoPerro.setTieneCola(false);//Cambio el valor del atributo
        System.out.println("El perro tiene cola? " + nuevoPerro.getTieneCola());//Llamo al valor del atributo



        //Constantes
        final int constanteEntero = 50;

    }
    
}