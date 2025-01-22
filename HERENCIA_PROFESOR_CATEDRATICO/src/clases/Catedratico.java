package clases;

public class Catedratico extends Profesor {
    private float implemento;
    
    Catedratico() {
        super();
    }

    public Catedratico(String nombre, String apellidos, String asignatura, int edad,  float sueldo, float implemento) {
        super(nombre, apellidos, edad, asignatura, sueldo);
        this.implemento = implemento;
    }

    public float getImplemento() { return this.implemento; }
    public void setImplemento(float implemento) { this.implemento = implemento; } 

    public String toString() {
        return "El catedrático " + this.getNombre() + " " + this.getApellidos() + " da la asignatura " + this.getAsignatura() + " y cobra " + this.getSueldo() + "$ con un aumento de " + this.getImplemento() + "$.";
    }
}
