package C14260824;

public class ArregloEstatico {
    //Los arreglos estáticos no permiten que incrementemos el número de elementos a almacenar una vez que ya lo inicialicé
    public static void main(String[] args) {

        //Los arreglos estáticos se pueden inicializar e indicar la longitud máxima
        String[] listaVacia = new String[5];

        //Puedo modificar el valor en un índice llamando al nombre del arreglo y el índice entre corchetes
        listaVacia[1] = "Segundo elemento";
        System.out.println("El elemento en segunda posición es " + listaVacia[1]);


        //A los arreglos estáticos cuando se inicializan, se les puede indicar los elementos dentro de llaves
        String[] alumnos = {"Marcelo", "Fabian", "Paula", "Branco"};

        //Imprime la "longitud" del arreglo
        System.out.println("La longitud máxima del arreglo es " + alumnos.length);

        //Iterar sobre el arreglo con un for
        /*
        for (int i = 0; i < alumnos.length; i++) {
            //Imprimo el valor de cada alumno en cada iteración
            System.out.println("En el asiento número " + (i+1) +  " está " + alumnos[i]);
        }*/



        //ForEach itera sobre cada elemento del array
        //La sintaxis => nombre de variable que va a tomar cada elemento : nombre del arreglo
        for (String alumno : alumnos) {
            System.out.println("En este asiento está " + alumno);
        }

    }

}
