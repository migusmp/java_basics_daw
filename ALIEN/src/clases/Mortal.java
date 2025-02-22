package clases;

/**
 * Mortal
 */
public class Mortal extends Individuo {
    private String trabajo;

    public Mortal() {
        super();
        this.trabajo = "no trabaja";
    }

    public Mortal(int id, String nombre, int nacimiento, String chamba) {
        super(id, nombre, nacimiento);
        this.trabajo = chamba;
    }

    public String getTrabajo() { return this.trabajo; }
    public void setTrabajo(String trabajo) { this.trabajo = trabajo; }

    public String toString() {
        String trabaja_o_no = (this.trabajo != "no trabaja") ? " trabaja como " + this.trabajo + "." : " no trabaja.";
        return "El mortal " + this.getNombre() + trabaja_o_no;
    }

    public boolean equals(Mortal m) {
        if (super.equals(m) && this.trabajo == m.trabajo) {
                return true;
        }
        return false;
    }

    @Override
    public Mortal clone() {
        Mortal mortal_cloned = (Mortal) super.clone();
        mortal_cloned.trabajo = this.trabajo;
        return mortal_cloned;
    }

}
