package clases;

public class Persona {
    private String nombre;
    private int edad;

    public Persona () {}

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNombre(String name) { this.nombre = name; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getNombre() { return this.nombre; }
    public int getEdad() { return this.edad; }
}
