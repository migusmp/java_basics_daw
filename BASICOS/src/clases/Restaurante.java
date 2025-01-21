package clases;

import java.util.List;

public class Restaurante {
    private String nombre;
    private String direccion;
    private int estrellas;
    private String especialidad;
    private String celiacos;  // "s" para sí, "n" para no
    private List<String> menu;

    // Constructor
    public Restaurante(String nombre, String direccion, int estrellas, String especialidad, String celiacos, List<String> menu) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estrellas = estrellas;
        this.especialidad = especialidad;
        this.celiacos = celiacos;
        this.menu = menu;
    }

    // Métodos setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public void setEstrellas(int estrellas) { this.estrellas = estrellas; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
    public void setCeliacos(String celiacos) { this.celiacos = celiacos; }
    public void setMenu(List<String> menu) { this.menu = menu; }

    // Métodos getters
    public String getNombre() { return this.nombre; }
    public String getDireccion() { return this.direccion; }
    public int getEstrellas() { return this.estrellas; }
    public String getEspecialidad() { return this.especialidad; }
    public String getCeliacos() { return this.celiacos; }
    public List<String> getMenu() { return this.menu; }

    // Método toString
    public String toString() {
        String celiacosStatus = (this.celiacos.equals("s")) ? "Sí" : "No";
        String estrellasText = "Estrellas: " + this.estrellas;
        String menuList = String.join(", ", this.menu);
        
        return "Restaurante: " + this.getNombre() + "\n" +
               "Dirección: " + this.getDireccion() + "\n" +
               estrellasText + "\n" +
               "Especialidad: " + this.getEspecialidad() + "\n" +
               "Apto para celiacos: " + celiacosStatus + "\n" +
               "Menú: " + menuList;
    }
}
