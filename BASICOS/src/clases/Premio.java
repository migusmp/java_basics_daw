package clases;

public class Premio {
    private String premiado;
    private String categoria;
    private double efectivo;

    public Premio(String premiado, String categoria, double efectivo) {
        this.premiado = premiado;
        this.categoria = categoria;
        this.efectivo = efectivo;
    }

    // Métodos setters
    public void setPremiado(String premiado) { this.premiado = premiado; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setEfectivo(double efectivo) { this.efectivo = efectivo; }

    // Métodos getters
    public String getPremiado() { return this.premiado; }
    public String getCategoria() { return this.categoria; }
    public double getEfectivo() { return this.efectivo; }

    // Método toString
    public String toString() {
        return "El premiado " + this.getPremiado() + " ha ganado un premio en la categoría " + this.getCategoria() + " por un valor de " + this.getEfectivo() + " euros.";
    }
}

