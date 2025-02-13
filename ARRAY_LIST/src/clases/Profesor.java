package clases;

public class Profesor extends Persona {
    private float sueldo;

    public Profesor() {}

    public Profesor(String nombre, int edad, float sueldo) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    public void setSueldo(float sueldo) { this.sueldo = sueldo; }
    public float getSueldo() { return this.sueldo; }
}
