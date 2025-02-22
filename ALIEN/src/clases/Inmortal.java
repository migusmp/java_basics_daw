package clases;

/**
 * Inmortal
 */
public class Inmortal extends Individuo {

    private String rango;
    private Mortal criado;

    // CONSTRUCTORES
    public Inmortal() {
        super();
        this.rango = "noble";
        this.criado = null;
    }

    public Inmortal(int id, String nombre, int nacimiento, String rango, Mortal criado) throws Exception {
        super(id, nombre, nacimiento);
        setRango(rango);
        this.criado = criado;
    }

    // SETTERS.
    public void setRango(String rango) throws Exception { 
        if (!rango.equals("noble") && !rango.equals("rey")) {
            throw new Exception("Error: Debes introducir el rango de 'rey' o 'noble'.");
        }
        this.rango = rango; 
    }
    public void setCriado(Mortal criado) { this.criado = criado; }

    // GETTERS
    public String getRango() { return this.rango; }
    public Mortal getCriado() { return this.criado; }

    // OTROS MÉTODOS
    public String toString() {
        String tiene_criado = (this.criado != null) ? " y tiene al criado " + this.criado.getNombre() + "." : " y no tiene criado";
        return "El inmortal " + this.getNombre() + " tiene el rango " + this.getRango() + tiene_criado;
    }

    public boolean equals(Inmortal i) {
        if (super.equals(i) && this.rango == i.rango && this.criado == i.criado) {
                return true;
        }
        return false;
    }

    @Override
    public Inmortal clone() {
            Inmortal cloned = (Inmortal) super.clone();
            cloned.rango = this.rango;
            cloned.criado = this.criado; 
            return cloned;
    }
}
