package clases;
public class Obrero {

    private String codigo; // Código del obrero.
    private String empresa;
    private int sueldo;
    private boolean beneficios; // Indica si el obrero puede recibir beneficios.

    public Obrero () {
        this.codigo = "ab";
        this.empresa = "Vinci";
        this.sueldo = 1000;
        this.beneficios = false;
    }

    public Obrero(String codigo, String empresa, int sueldo, boolean beneficios) {
        this.codigo = codigo;
        this.empresa = empresa;
        this.sueldo = sueldo;
        this.beneficios = beneficios;
    }

    public Obrero(Obrero copy) {
        this.codigo = copy.codigo;
        this.empresa = copy.empresa;
        this.sueldo = copy.sueldo;
        this.beneficios = copy.beneficios;
    }
    
    // SETTERS
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setEmpresa(String empresa) { this.empresa = empresa; }
    public void setSueldo(int sueldo) { this.sueldo = sueldo; }
    public void setBeneficios(boolean pagar) { this.beneficios = pagar; }
    
    // GETTERS
    public String getCodigo() { return this.codigo; }
    public String getEmpresa() { return this.empresa; }
    public int getSueldo() { return this.sueldo; }
    public boolean recibeBeneficios() { return this.beneficios; }
    public float getTotalBeneficios(int porcentaje) {
        float beneficios = (this.sueldo * porcentaje) / 100;
        return beneficios; 
    }

    // OTROS MÉTODOS
    public String toString() {
        String cobra_beneficios = this.beneficios ? " y cobra beneficios." : " y no cobra beneficios.";
        return "El obrero " + this.codigo + " trabaja en la empresa " + this.empresa + " y tiene un sueldo de " + this.sueldo + cobra_beneficios;
    }

    public boolean equals(Obrero o) {
        if (this.codigo == o.getCodigo() && this.empresa == o.getEmpresa() && this.sueldo == o.getSueldo() && this.beneficios == o.recibeBeneficios()) {
            return true;
        }
        return false;
    }
}
