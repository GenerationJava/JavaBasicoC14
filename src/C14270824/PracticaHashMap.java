package C14270824;

import java.util.HashMap;
import java.util.Map;

public class PracticaHashMap {

    public static void main(String[] args) {
        //HashMap es una estructura que implementa la interfaz Map y almacena en pares clave:valor

        Map<String, String> pokemonFavorito = new HashMap<>();
        System.out.println(pokemonFavorito);

        //Agregar elementos al HashMap a través del método .put()
        pokemonFavorito.put("Marcelo",  "Buizel");
        pokemonFavorito.put("Almendra", "Ditto");
        pokemonFavorito.put("Fabian Canales", "Quilava");
        pokemonFavorito.put("Fabian Vilches", "Oshawott");
        pokemonFavorito.put("Paula", "Chikorita");
        pokemonFavorito.put("Marcelo", "Vaporeon");//Si vuelvo a ingresar un valor, se actualiza el valor almacenado en la clave

        System.out.println(pokemonFavorito);

        //Obtener un elemento en particular, podemos obtener un elemento llamando a su clave
        System.out.println("El pokemon favorito de Paula es " + pokemonFavorito.get("Paula"));

        //Remover un elemento se hace indicando la clave
        pokemonFavorito.remove("Marcelo");
        System.out.println(pokemonFavorito);

        //Verificar si existe la clave dentro del HashMap
        System.out.println(pokemonFavorito.containsKey("Marcelo"));

        //Imprimir la longitud de este HashMap está el método size()
        System.out.println("La longitud de este HashMap es " + pokemonFavorito.size());

        //Recorrer un HashMap con EntrySet a través de un foreach
        /*
        for (Map.Entry<String, String> entrada : pokemonFavorito.entrySet()) {
            String clave = entrada.getKey();
            String valor = entrada.getValue();
            System.out.println("El entrenador se llama " + clave + " y " + " su pokemon se llama " + valor);
        }
        */

        //Recorriendo el HashMap a través del keySet() que busca las claves
        for ( String clave : pokemonFavorito.keySet()) {
            System.out.println("El entrenador se llama " + clave + " y " + " su pokemon se llama " + pokemonFavorito.get(clave));
        }





    }
}
