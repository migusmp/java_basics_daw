package clases;

public class Ciudad {
    private String nombre;
    private int habitantes;
    private boolean capital;

    // Constructor
    public Ciudad(String nombre, int habitantes, boolean capital) {
        this.nombre = nombre;
        this.habitantes = habitantes;
        this.capital = capital;
    }

    // Métodos para establecer los valores
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setHabitantes(int habitantes) { this.habitantes = habitantes; }
    public void setCapital(boolean capital) { this.capital = capital; }

    // Métodos para obtener los valores
    public String getNombre() { return this.nombre; }
    public int getHabitantes() { return this.habitantes; }
    public boolean isCapital() { return this.capital; }

    // Método toString para imprimir los detalles de la ciudad
    public String toString() {
        String esCapital = this.capital ? "es la capital." : "no es la capital.";
        return "La ciudad " + this.getNombre() + " tiene " + this.getHabitantes() + " habitantes y " + esCapital;
    }
}
