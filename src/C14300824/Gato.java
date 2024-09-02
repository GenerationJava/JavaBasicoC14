package C14300824;

import C14020924.Mascota;

public class Gato extends Mascota {

    //Atributos en común para las mascotas
    private Integer numeroDeVidas;
    /*
    private String nombre;
    private String color;
    private Integer edad;
    private String raza;*/


    //Constructores
    public Gato() {
    }

    public Gato(String nombre, String color, Integer edad, String raza, Integer numeroDeVidas) {
        super(nombre, color, edad, raza);
        this.numeroDeVidas = numeroDeVidas;
    }

    //Getters & Setters
    public Integer getNumeroDeVidas() {
        return numeroDeVidas;
    }

    public void setNumeroDeVidas(Integer numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
    }


    //Métodos
    public String maullar() {
        return "Miau";
    }

    public void Ignorar() {
        System.out.println("Te miro feo y te ignoro");
    }





}
