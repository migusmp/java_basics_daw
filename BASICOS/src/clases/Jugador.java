package clases;

public class Jugador {
    private String deporte;
    private int numero;
    private String equipo;

    public Jugador(String deporte, int numero, String equipo) {
        this.deporte = deporte;
        this.numero = numero;
        this.equipo = equipo;
    }

    // Métodos setters
    public void setDeporte(String deporte) { this.deporte = deporte; }
    public void setNumero(int numero) { this.numero = numero; }
    public void setEquipo(String equipo) { this.equipo = equipo; }

    // Métodos getters
    public String getDeporte() { return this.deporte; }
    public int getNumero() { return this.numero; }
    public String getEquipo() { return this.equipo; }

    // Método toString
    public String toString() {
        return "El jugador juega al deporte " + this.getDeporte() + ", tiene el número " + this.getNumero() + " y juega en el equipo " + this.getEquipo() + ".";
    }
}
