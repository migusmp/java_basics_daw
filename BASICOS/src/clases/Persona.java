package clases;

public class Persona {
    private String nombre;
    private int edad;
    private float altura;
    private String dni;

    public Persona(String nombre, int edad, float altura, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.dni = dni;
    }

    // Métodos setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setAltura(float altura) { this.altura = altura; }
    public void setDni(String dni) { this.dni = dni; }

    // Métodos getters
    public String getNombre() { return this.nombre; }
    public int getEdad() { return this.edad; }
    public float getAltura() { return this.altura; }
    public String getDni() { return this.dni; }

    // Método toString
    public String toString() {
        return "La persona " + this.getNombre() + " tiene " + this.getEdad() + " años, una altura de " + this.getAltura() + " metros y su DNI es " + this.getDni() + ".";
    }
}

