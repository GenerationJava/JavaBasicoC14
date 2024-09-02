package C14020924;

public class Mascota {


    //Atributos para las mascotas
    private String nombre;
    private String color;
    private Integer edad;
    private String raza;


    //Constructores
    public Mascota() {
    }

    public Mascota(String nombre, String color, Integer edad, String raza) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.raza = raza;
    }

    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
