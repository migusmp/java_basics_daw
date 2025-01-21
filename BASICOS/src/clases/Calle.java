package clases;

public class Calle {
    private String nombre;
    private String ciudad;
    private String[] paradasAutobus;

    // Constructor
    public Calle(String nombre, String ciudad, String[] paradasAutobus) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.paradasAutobus = paradasAutobus;
    }

    // Métodos setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
    public void setParadasAutobus(String[] paradasAutobus) { this.paradasAutobus = paradasAutobus; }

    // Métodos getters
    public String getNombre() { return this.nombre; }
    public String getCiudad() { return this.ciudad; }
    public String[] getParadasAutobus() { return this.paradasAutobus; }

    // Método toString
    public String toString() {
        StringBuilder paradas = new StringBuilder();
        for (int i = 0; i < paradasAutobus.length; i++) {
            paradas.append(paradasAutobus[i]);
            if (i < paradasAutobus.length - 1) {
                paradas.append(", ");
            }
        }

        return "Calle: " + this.getNombre() + "\n" +
               "Ciudad: " + this.getCiudad() + "\n" +
               "Paradas de Autobús: " + paradas.toString();
    }
}
