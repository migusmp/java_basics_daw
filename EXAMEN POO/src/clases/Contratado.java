package clases;

/**
 * Contratado
 */
public class Contratado extends Obrero {
    private int anios;
    private int meses;

    public Contratado() {
        super();
        this.anios = 0;
        this.meses = 6;
    }

    public Contratado(String codigo, String empresa, int sueldo, boolean beneficios, int anios, int meses) {
        super(codigo, empresa, sueldo, beneficios);
        this.anios = anios;
        this.meses = meses;
    }

    public Contratado(Contratado copy) {
        this.anios = copy.anios;
        this.meses = copy.meses;
        this.setCodigo(copy.getCodigo());
        this.setEmpresa(copy.getEmpresa());
        this.setSueldo(copy.getSueldo());
        this.setBeneficios(copy.recibeBeneficios());
    }

    // SETTERS
    public void setMeses(int meses) { this.meses = meses; }
    public void setAnios(int anios) { this.anios = anios; }
    
    // GETTERS
    public int getMeses() { return this.meses; }
    public int getAnios() { return this.anios; }
    public String getTipoDeContrato() {
        if (this.meses <= 6 && this.anios == 0) {
            return "fijo discontinuo";
        }
        return "otro";
    }

    // OTROS MÉTODOS
    public String toString() {
        return "El obrero " + this.getCodigo() + " ha sido contratado " + this.anios + " años y " + this.meses
                + " meses en la empresa " + this.getEmpresa() + ".";
    }

    public boolean equals(Contratado c) {
        if (this.getEmpresa() == c.getEmpresa() && this.getCodigo() == c.getCodigo()
                && this.getSueldo() == c.getSueldo() && this.anios == c.anios && this.meses == c.meses) {
            return true;
        }
        return false;
    }
}
