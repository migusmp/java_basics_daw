package clases;

public class Asignatura {
    private String nombre;
    private String profesor;
    private int horas;

    public Asignatura(String nombre, String profesor, int horas) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.horas = horas;
    }

    public String getProfesor() { return this.profesor; }
    public String getNombre() { return this.nombre; }
    public int getHoras() { return this.horas; }

    public void setProfesor(String profesor) { this.profesor = profesor; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setHoras(int horas) { this.horas = horas; }

    public String toString() {
        return "La asignatura " + this.getNombre() + " es impartida por " + this.getProfesor() + " y tiene " + this.getHoras() + " horas.";
    }

}
