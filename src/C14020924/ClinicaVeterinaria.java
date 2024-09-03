package C14020924;

import C14030924.Loro;
import C14300824.Gato;
import C14300824.Perro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClinicaVeterinaria {

    public static void main(String[] args) {

        Perro perroUno = new Perro("Poochie", "Negro", 0, "Mezcla", true);
        Perro perroDos = new Perro("Sofi", "Blanco", 8, "Poodle Toy", false);
        Perro perroTres = new Perro("Bowy", "Café", 5, "Mestizo", true);
        Perro perroCuatro = new Perro(true);

        Gato gatoUno = new Gato("Frankie", "Tricolor", 6, "Calico", 6);
        Gato gatoDos = new Gato("Porcino", "Gris con rayas blancas", 7, "Mestizo", 8);
        Gato gatoTres = new Gato("Julieta", "Tricolor", 4, "Calico", 9);

        Conejo conejoUno = new Conejo("Lilly", "Tricolor", 0, "Mestizo", 3, false);

        Loro loroUno = new Loro("Lorenzo", "Verde", 1, "Australiano", "Corto", true);

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

        System.out.println("El perro " + perroUno.getNombre());
        perroUno.alimentarse();

        //Creo un Scanner para indicarle palabras al loro
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Qué palabra le quieres enseñar a tu loro?");
        String palabra = miScanner.nextLine();

        //Hasta ahora el método dicePalabras() sólo recibe un argumento
        System.out.println("Tu loro dijo " + loroUno.dicePalabras(palabra));
        System.out.println("Tu loro ahora aprendió a decir " + loroUno.dicePalabras("Hola mundo", 5, true));





    }
}
