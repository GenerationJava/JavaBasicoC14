package C14030924;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class FilesManager {

    //Método para crear un archivo
    public static void crearArchivoSiNoExiste() {
        //Clase Path, me permite trabajar con rutas o URL
        Path rutaArchivo = Paths.get("C:\\Users\\alesh\\OneDrive\\Escritorio\\Comandos\\nuevoarchivo.txt");
        if (!(Files.exists(rutaArchivo))) {
            try {
                //El bloque try me permite probar un bloque de código que puede resultar en error
                Files.createFile(rutaArchivo);
                System.out.println("Archivo creado exitosamente");
            } catch (IOException exception) {
                //El bloque catch me permite manejar la excepción, que es un objeto que representa el error
                System.out.println("Archivo no se puede crear " + exception.getMessage());
            }
        } else {
            System.out.println("El archivo ya existe");
        }
    }

    public static void escribirEnElArchivo() throws IOException, MyException {
        Path rutaArchivo = Paths.get("C:\\Users\\alesh\\OneDrive\\Escritorio\\Comandos\\nuevoarchivo.txt");
        List<String> frasesParaAgregar = Arrays.asList("Tangamandapio", "wubaduba dub dub", "a la grande le puse cuca");

        //En caso de que el arrayList esté vacío lanzo una excepción personalizada
        if (frasesParaAgregar.isEmpty()) {
            throw new MyException("La lista de frases a agregar está vacía");
        }

        Files.write(rutaArchivo, frasesParaAgregar, StandardOpenOption.APPEND);
        System.out.println("Se ha escrito en el archivo exitosamente");
    }

    public static void leerArchivo() {
        Path rutaArchivo = Paths.get("C:\\Users\\alesh\\OneDrive\\Escritorio\\Comandos\\nuevoarchivo.txt");
        try {
            List<String> frasesArchivo = Files.readAllLines(rutaArchivo);
            for (String frase : frasesArchivo) {
                System.out.println(frase);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        } finally {
            System.out.println("Esto se ejecuta a pesar de que la excepción sea lanzada");
        }
    }

    public static void main(String[] args) {
        /*
        int[] arregloEstatico = {1,2,3};
        System.out.println(arregloEstatico[3]);*/

        //LLamado a un método que maneja la excepción en un bloque try/catch
        crearArchivoSiNoExiste();


        //Llamado a un método que lanza la excepción en la declaración del método
        try {
            escribirEnElArchivo();
            System.out.println("Se ejecutó el método exitosamente");
        } catch (IOException e) {
            System.out.println("Error con la escritura del archivo");
        } catch (MyException e) {
            System.out.println("MI excepción personalizada");
        }

        leerArchivo();


    }
}
