package clases;

public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;

    Persona() {

    }

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() { return this.nombre; }
    public String getApellidos() { return this.apellidos; }
    public int getEdad() { return this.edad; }

    public String toString() {
        return this.getNombre() + " " + this.getApellidos() + " tiene " + this.getEdad() + " años.";
    }
}
