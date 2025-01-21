package clases;

public class Deporte {
    private String nombre;
    private boolean olimpico;

    public Deporte(String nombre, boolean olimpico) {
        this.nombre = nombre;
        this.olimpico = olimpico;
    }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setOlimpico(boolean olimpico) { this.olimpico = olimpico; }

    public String getNombre() { return this.nombre; }
    public boolean getOlimpico() { return this.olimpico; }
    
    public String toString() {
        String olimpico = "es olimpico.";
        String no_olimpico = "no es olimpico.";
        String frase = "El deporte " + this.getNombre();

        if (this.olimpico) {
            frase += " " + olimpico;
        } else {
            frase += " " + no_olimpico;
        }

        return frase;
    }
}
