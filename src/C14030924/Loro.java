package C14030924;

import C14020924.Mascota;

public class Loro extends Mascota implements Volador {

    //Atributos del Loro
    private String longitudPlumaje;
    private Boolean puedeHablar;

    //Constructores
    public Loro() {
    }

    public Loro(String nombre, String color, Integer edad, String raza, String longitudPlumaje, Boolean puedeHablar) {
        super(nombre, color, edad, raza);
        this.longitudPlumaje = longitudPlumaje;
        this.puedeHablar = puedeHablar;
    }

    //Getter y Setter
    public String getLongitudPlumaje() {
        return longitudPlumaje;
    }

    public void setLongitudPlumaje(String longitudPlumaje) {
        this.longitudPlumaje = longitudPlumaje;
    }

    public Boolean getPuedeHablar() {
        return puedeHablar;
    }

    public void setPuedeHablar(Boolean puedeHablar) {
        this.puedeHablar = puedeHablar;
    }

    //Override equivale a sobreescritura de métodos, una manera de implementar polimorfismo
    @Override
    public String toString() {
        return "Loro " +
                "longitudPlumaje='" + longitudPlumaje + '\'' +
                ", puedeHablar=" + puedeHablar;
    }

    //Sobrecarga del método dicePalabras()
    public String dicePalabras(String palabraUno) {
        return palabraUno;
    }

    //La sobrecarga permite agregar más argumentos al mismo método
    public String dicePalabras(String palabraUno, Integer numeroUno, Boolean condicion) {
        return palabraUno + numeroUno.toString() + condicion.toString();
    }

    /* El mismo método puede tener un tipo de dato de retorno distinto
    public Double dicePalabras(Double decimalUno, Double decimalDos){
        return decimalUno + decimalDos;
    }*/

    //Sobreescritura del método de su interfaz padre
    @Override
    public void puedeVolar() {
        System.out.println("El loro vuela poco");
    }





}
