package C14020924;

import C14300824.Gato;
import C14300824.Perro;

import java.util.ArrayList;
import java.util.List;

public class ClinicaVeterinaria {

    public static void main(String[] args) {

        Perro perroUno = new Perro("Poochie", "Negro", 0, "Mezcla", true);
        Perro perroDos = new Perro("Sofi", "Blanco", 8, "Poodle Toy", false);
        Perro perroTres = new Perro("Bowy", "Café", 5, "Mestizo", true);

        Gato gatoUno = new Gato("Frankie", "Tricolor", 6, "Calico", 6);
        Gato gatoDos = new Gato("Porcino", "Gris con rayas blancas", 7, "Mestizo", 8);
        Gato gatoTres = new Gato("Julieta", "Tricolor", 4, "Calico", 9);

        Conejo conejoUno = new Conejo("Lilly", "Tricolor", 0, "Mestizo", 3, false);

        List<Perro> listaPerros = new ArrayList<>();
        listaPerros.add(perroUno);
        listaPerros.add(perroDos);
        listaPerros.add(perroTres);

        List<Gato> listaGatos = new ArrayList<>();
        listaGatos.add(gatoUno);
        listaGatos.add(gatoDos);
        listaGatos.add(gatoTres);

        /*************************************/
        System.out.println("****LISTA DE PERROS****");
        for (Perro perro : listaPerros) {
            System.out.println("El perro se llama " + perro.getNombre());
            System.out.println(perro);
        }

        for (int i = 0; i < listaGatos.size(); i++) {
            System.out.println("El gato se llama " + listaGatos.get(i).getNombre());
        }

        System.out.println(conejoUno);







    }
}
