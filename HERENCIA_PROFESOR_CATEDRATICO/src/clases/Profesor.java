package clases;

public class Profesor extends Persona {
    private String asignatura;
    private float sueldo;

    Profesor() {
        super();
    }

    public Profesor(String nombre, String apellidos, int edad, String asignatura, float sueldo) {
        super(nombre, apellidos, edad);
        this.asignatura = asignatura;
        this.sueldo = sueldo;
    }

    public void setAsignatura(String asignatura) { this.asignatura = asignatura; }
    public void setSueldo(int sueldo) { this.sueldo = sueldo; }

    public String getAsignatura() { return this.asignatura; }
    public float getSueldo() { return this.sueldo; }

    public String toString() {
        return this.getNombre() + " " + this.getApellidos() + " da la asignatura " + this.getAsignatura() + " y cobra " + this.getSueldo() + "$.";
    }
}
