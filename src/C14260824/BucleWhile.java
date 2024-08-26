package C14260824;

public class BucleWhile {
    //El bucle se ejecuta indefinidamente siempre y cuando la condición se evalúe como verdadera
    public static void main(String[] args) {
        //Contador de despegue
        Integer variableAcumuladora = 10;

        //While significa que "mientras" la condición sea true, va a seguir iterando y ejecutando el bloque de código
        while (variableAcumuladora >= 0) {
            //Imprimo el valor de variableAcumuladora
            System.out.println(variableAcumuladora);
            //Le resto uno a variableAcumuladora
            variableAcumuladora--;
        }

        //Cuando la consición se evalúe como false, sale del bucle y ejecuta lo que esté debajo
        System.out.println("Despegue!");
    }
}
