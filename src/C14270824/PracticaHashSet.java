package C14270824;

import java.util.*;
import java.util.stream.Collectors;

public class PracticaHashSet {

    public static void main(String[] args) {

        //HashSet es implementación de interfaz Set y no permite el ingreso de duplicados y no tiene un orden específico
        Set<String> peliculasFavoritas = new HashSet<>();
        System.out.println(peliculasFavoritas);

        //Para agregar elementos en un HashSet lo hago con
        peliculasFavoritas.add("Matrix");
        peliculasFavoritas.add("Sinister");
        peliculasFavoritas.add("American Sniper");
        peliculasFavoritas.add("Shrek");
        peliculasFavoritas.add("Bajo la misma estrella");

        System.out.println(peliculasFavoritas);
        peliculasFavoritas.add("Matrix");//No se agrega nuevamente

        //Verifico si un elemento existe
        System.out.println("La película está en el conjunto? " + peliculasFavoritas.contains("Matrix"));

        //Remover elemento
        peliculasFavoritas.remove("Sinister");
        System.out.println(peliculasFavoritas);

        //Obtener longitud
        System.out.println("Este conjunto tiene una longitud de " + peliculasFavoritas.size() + " elementos");

        //Puedo iterar con el for each
        /*
        for (String pelicula : peliculasFavoritas ) {
            System.out.println(pelicula + ", esta película es muy buena");
        }*/

        peliculasFavoritas.forEach(pelicula -> System.out.println(pelicula));

        //Ordenar las películas y crear una nueva lista ordenada, llamamos a la abstraccion streams y a sus métodos y finalmente el método collect() para convertirlo en una nueva lista o un nuevo set o map
        List<String> listaOrdenadaDePeliculas = peliculasFavoritas.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(listaOrdenadaDePeliculas);











    }
}
