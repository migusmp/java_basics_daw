package clases;

public class Patin {
    private String modelo;
    private boolean electrico;
    private double precio;

    public Patin(String modelo, boolean electrico, double precio) {
        this.modelo = modelo;
        this.electrico = electrico;
        this.precio = precio;
    }

    // Métodos setters
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setElectrico(boolean electrico) { this.electrico = electrico; }
    public void setPrecio(double precio) { this.precio = precio; }

    // Métodos getters
    public String getModelo() { return this.modelo; }
    public boolean getElectrico() { return this.electrico; }
    public double getPrecio() { return this.precio; }

    // Método toString
    public String toString() {
        String electricoInfo = this.electrico ? "es eléctrico." : "no es eléctrico.";
        return "El patín modelo " + this.getModelo() +
               ", con un precio de " + this.getPrecio() + " euros, " +
               electricoInfo;
    }
}
