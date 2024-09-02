package C14020924;

public class Conejo extends Mascota {

    //Atributos del conejo
    private Integer longitudOrejas;
    private Boolean ojosAsesinos;

    //Constructores
    public Conejo() {
    }

    public Conejo(String nombre, String color, Integer edad, String raza, Integer longitudOrejas, Boolean ojosAsesinos) {
        super(nombre, color, edad, raza);
        this.longitudOrejas = longitudOrejas;
        this.ojosAsesinos = ojosAsesinos;
    }

    //GEtters y Setters
    public Integer getLongitudOrejas() {
        return longitudOrejas;
    }

    public void setLongitudOrejas(Integer longitudOrejas) {
        this.longitudOrejas = longitudOrejas;
    }

    public Boolean getOjosAsesinos() {
        return ojosAsesinos;
    }

    public void setOjosAsesinos(Boolean ojosAsesinos) {
        this.ojosAsesinos = ojosAsesinos;
    }

    @Override
    public String toString() {
        return "Conejo{" +
                "longitudOrejas=" + longitudOrejas +
                ", ojosAsesinos=" + ojosAsesinos +
                '}';
    }
}
