package clases;

public class Alumno {
    private String nombre;
    private String curso;
    private double nota;

    // Constructor
    public Alumno(String nombre, String curso, double nota) {
        this.nombre = nombre;
        this.curso = curso;
        this.nota = nota;
    }

    // Métodos setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCurso(String curso) { this.curso = curso; }
    public void setNota(double nota) { this.nota = nota; }

    // Métodos getters
    public String getNombre() { return this.nombre; }
    public String getCurso() { return this.curso; }
    public double getNota() { return this.nota; }

    // Método toString
    public String toString() {
        return "Alumno: " + this.getNombre() + "\nCurso: " + this.getCurso() + "\nNota: " + this.getNota();
    }

    // Método para verificar si ha aprobado el curso (nota >= 5)
    public boolean haAprobado() {
        return this.nota >= 5;
    }
}
