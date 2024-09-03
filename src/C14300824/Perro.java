package C14300824;

import C14020924.Mascota;

public class Perro extends Mascota {

    //Atributos
    //Variable estática "static" o variable de clase
    //Constante con palabra reservada final
    //Variables de instancia
    //El private es para encapsular
    protected final int numeroOrejas = 2;
    private Boolean tieneCola;

    /* ATRIBUTOS EN COMUN PARA LAS MASCOTAS
    public String nombre;
    private String color;
    private Integer edad;
    private String raza;
     */

    //Constructores
    //Vacío
    public Perro() {
    }

    //Lleno
    public Perro(Boolean tieneCola) {
        this.tieneCola = tieneCola;
    }

    public Perro(String nombre, String color, Integer edad, String raza, Boolean tieneCola) {
        super(nombre, color, edad, raza);
        this.tieneCola = tieneCola;
    }


    //Getters y Setters
    public int getNumeroOrejas() {
        return numeroOrejas;
    }

    public Boolean getTieneCola() {
        return tieneCola;
    }

    public void setTieneCola(Boolean tieneCola) {
        this.tieneCola = tieneCola;
    }

    //Métodos o comportamiendo del perro
    public String ladrar() {
        return "Guau guau";
    }

    //Usamos sobreescritura para cambiar el comportamiento del método de la superclase
    @Override
    public void alimentarse() {
        //Ahora el método imprime esto en vez de lo que indicaba en la superclase
        System.out.println("Come 2kg de comida al día");
    }







}
