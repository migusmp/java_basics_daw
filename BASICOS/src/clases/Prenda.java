package clases;

public class Prenda {
    private String tipo;
    private String talla;
    private String color;
    private double precio;

    public Prenda(String tipo, String talla, String color, double precio) {
        this.tipo = tipo;
        this.talla = talla;
        this.color = color;
        this.precio = precio;
    }

    // Métodos setters
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setTalla(String talla) { this.talla = talla; }
    public void setColor(String color) { this.color = color; }
    public void setPrecio(double precio) { this.precio = precio; }

    // Métodos getters
    public String getTipo() { return this.tipo; }
    public String getTalla() { return this.talla; }
    public String getColor() { return this.color; }
    public double getPrecio() { return this.precio; }

    // Método toString
    public String toString() {
        return "La prenda de tipo " + this.getTipo() + " tiene talla " + this.getTalla() + ", color " + this.getColor() + " y cuesta " + this.getPrecio() + " euros.";
    }
}
