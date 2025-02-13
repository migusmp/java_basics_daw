package clases;

/**
 * Individuo
 */
public class Individuo implements Cloneable {
    private int id;
    private String nombre;
    private int nacimiento;

    public Individuo() {
        this.nacimiento = 1900;
    }

    public Individuo(int id, String nombre, int nacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    // SETTERS
    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setNacimiento(int nacimiento) { this.nacimiento = nacimiento; }

    // GETTERS
    public int getId() { return this.id; }
    public String getNombre() { return this.nombre; }
    public int getNacimiento() { return this.nacimiento; }

    // OTROS MÉTODOS
    public String toString() {
        return "Individuo: { id: " + this.id + ", nombre: " + this.nombre + ", nacimiento: " + this.nacimiento + " };";
    }

    public boolean equals(Individuo i) {
        if (this.id == i.id && this.nombre == i.nombre && this.nacimiento == i.nacimiento) {
            return true;
        }
        return false;
    }

    @Override
    public Individuo clone() {
        try {
            return (Individuo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
