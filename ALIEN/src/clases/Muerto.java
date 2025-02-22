package clases;

/**
 * Muerto
 */
// NO ESTA PROBADO
public class Muerto extends Individuo {
    private int fallecimiento;

    public Muerto() {
        super();
    }

    public Muerto(int id, String nombre, int nacimiento, int fallecimiento) throws Exception {
        super(id, nombre, nacimiento);
        this.setFallecimiento(fallecimiento);
    }

    public int getFallecimiento() {
        return this.fallecimiento;
    }

    public void setFallecimiento(int fallecimiento) throws Exception {
        if (fallecimiento < this.getNacimiento()) {
            throw new Exception("Error: la fecha de fallecimiento no puede ser inferior a la de nacimiento");
        }
        this.fallecimiento = fallecimiento;
    }

    public String toString() {
        return this.getNombre() + " nació en " + this.getNacimiento() + " y falleció en " + this.getFallecimiento() + ".";
    }

    public boolean equals(Muerto m) {
        if (super.equals(m) && this.fallecimiento == m.fallecimiento) {
            return true;
        }
        return false;
    }

    public Muerto clone() {
        Muerto cloned = (Muerto) super.clone();
        return cloned;
    }

}
