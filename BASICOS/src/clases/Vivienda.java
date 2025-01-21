package clases;

public class Vivienda {
    private double metros;
    private int plantas;

    public Vivienda(double metros, int plantas) {
        this.metros = metros;
        this.plantas = plantas;
    }

    // Métodos setters
    public void setMetros(double metros) { this.metros = metros; }
    public void setPlantas(int plantas) { this.plantas = plantas; }

    // Métodos getters
    public double getMetros() { return this.metros; }
    public int getPlantas() { return this.plantas; }

    // Método toString
    public String toString() {
        return "La vivienda tiene " + this.getMetros() + " metros cuadrados y " +
               this.getPlantas() + (this.plantas == 1 ? " planta." : " plantas.");
    }
}

