package clases;

/**
 * Empresario
 */
public class Empresario extends Obrero {
    private int porcentaje = 20;

    // CONSTRUCTORES
    public Empresario() {
        super();
        this.setBeneficios(true);
    }

    public Empresario(String codigo, String empresa, int sueldo) {
        super(codigo, empresa, sueldo, true);
    }

    public Empresario(Empresario copy) {
        this.setCodigo(copy.getCodigo());
        this.setEmpresa(copy.getEmpresa());
        this.setSueldo(copy.getSueldo());
        this.setBeneficios(true);
    }

    // GETTERS
    public int getPorcentaje() {
        return this.porcentaje;
    }

    // SETTERS
    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    // OTROS MÉTODOS
    public String toString() {
        return "El empresario " + this.getCodigo() + " trabaja en la empresa " + this.getEmpresa() + " y cobra "
                + this.getSueldo() + " y cobra beneficios con un porcentaje de un " + this.porcentaje + "%.";
    }

    public boolean equals(Empresario emp) {
        if (this.getEmpresa() == emp.getEmpresa() && this.getCodigo() == emp.getCodigo()
                && this.getSueldo() == emp.getSueldo()) {
            return true;
        }
        return false;
    }

}
