package C14270824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PracticaArrayList {

    //Los ArrayList son un arreglo dinámico, tienen métodos para agregar y eliminar elementos y no tienen una longitud fija

    public static void main(String[] args) {

        //La sintaxis para crear un ArrayList es la siguiente:
        //Interfaz "List" + <TipoDeDato> + nombreVariable = Incialización como nueva instancia vacía de la clase ArrayList
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Esta es mi caja de números " + numeros);

        //Para agregar elementos, usamos el método .add() para agregar al final del ArrayList
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        //La otra manera de utilizar el .add() es indicándole el índice antes del elemento
        numeros.add(2, 8);
        System.out.println("Mi nueva caja de números: " + numeros);

        //Remover un elemento está el método .remove()
        numeros.remove(2);
        System.out.println("Después de eliminar el elemento en el índice 2 " + numeros);

        //Conocer la longitud del ArrayList a través del método .size()
        //Conocer el elemento en un índice mediante el método .get()
        for (int i = 0; i < numeros.size(); i++ ) {
            System.out.println("El número " + numeros.get(i));
        }

        //Si deseo conocer si un elemento existe, tengo el método .contains()
        System.out.println("El número está presente " + numeros.contains(3));

        //Cambiar elemento en un índice mediante el método .set()
        numeros.set(2, 8);
        System.out.println(numeros);

        //Obtener el mínimo y el máximo elemento llamando a la clase Collections y métodos .max() y -min()
        System.out.println("El número más alto es " + Collections.max(numeros));
        System.out.println("El número más bajo es " + Collections.min(numeros));

        //Ordenar o revertir el orden del ArrayList llamando a la clase Collections y los métodos .sort() y .reverse()
        Collections.sort(numeros);
        System.out.println(numeros);

        Collections.reverse(numeros);
        System.out.println(numeros);

        numeros.clear();
        System.out.println(numeros);

        /***************************************************/
        List<String> nombres = new ArrayList<>();
        System.out.println("Esta es mi caja de nombres" + nombres);

        //Para agregar elementos. usamos el metodo .add()
        nombres.add("Marcelo");
        nombres.add("César");
        nombres.add("Gregorio");
        nombres.add("Gerbacio");

        //La otra manera de utilizar el add es indicandole el indice(index) antes del elemento
        nombres.add("Marcelo");
        System.out.println("Mi nueva caja de números: " + nombres);





    }
}
