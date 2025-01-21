package clases;

public class Seleccion {
    private String pais;
    private String deporte;
    private String genero;

    public Seleccion(String pais, String deporte, String genero) {
        this.pais = pais;
        this.deporte = deporte;
        this.genero = genero;
    }

    // Métodos setters
    public void setPais(String pais) { this.pais = pais; }
    public void setDeporte(String deporte) { this.deporte = deporte; }
    public void setGenero(String genero) { this.genero = genero; }

    // Métodos getters
    public String getPais() { return this.pais; }
    public String getDeporte() { return this.deporte; }
    public String getGenero() { return this.genero; }

    // Método toString
    public String toString() {
        return "La selección de " + this.getPais() + " juega " + this.getDeporte() + " en la categoría " + this.getGenero() + ".";
    }
}
