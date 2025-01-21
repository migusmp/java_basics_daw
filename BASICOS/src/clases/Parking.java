package clases;

public class Parking {
    private int plazas;
    private String nombre;
    private double minuto;

    // Constructor
    public Parking(int plazas, String nombre, double minuto) {
        this.plazas = plazas;
        this.nombre = nombre;
        this.minuto = minuto;
    }

    // Métodos setters
    public void setPlazas(int plazas) { this.plazas = plazas; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setMinuto(double minuto) { this.minuto = minuto; }

    // Métodos getters
    public int getPlazas() { return this.plazas; }
    public String getNombre() { return this.nombre; }
    public double getMinuto() { return this.minuto; }

    // Método toString
    public String toString() {
        return "Parking: " + this.getNombre() + "\nPlazas disponibles: " + this.getPlazas() + "\nPrecio por minuto: " + this.getMinuto() + " EUR";
    }

    // Método para aparcar un coche (reduce el número de plazas)
    public void aparcar() {
        if (this.plazas > 0) {
            this.plazas--;
            System.out.println("Coche aparcado. Plazas disponibles: " + this.plazas);
        } else {
            System.out.println("No hay plazas disponibles.");
        }
    }

    // Método para liberar una plaza (aumenta el número de plazas)
    public void liberar() {
        this.plazas++;
        System.out.println("Plaza liberada. Plazas disponibles: " + this.plazas);
    }

    // Método para calcular el precio por el tiempo de aparcamiento
    public double calcularPrecio(double minutosAparcado) {
        return minutosAparcado * this.minuto;
    }
}
