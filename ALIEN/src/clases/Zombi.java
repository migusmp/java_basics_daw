package clases;

/**
 * Zombi
 */
public class Zombi extends Muerto {

    private int agresividad;
    private int estado;

    public Zombi() {
        super();
        this.agresividad = 0;
        this.estado = 2;
    }

    public Zombi(int agresividad, int estado) throws Exception {
        super();
        setAgresividad(agresividad);
        setEstado(estado);
    }

    public void setAgresividad(int agresividad) throws Exception {
        if (this.agresividad < 0 || this.agresividad > 3) {
            throw new Exception(
                    "Error: El nivel de agresividad permitido es del 0 al 3 | => agresividad puesta: " + agresividad);
        }
        this.agresividad = agresividad;
    }

    public void setEstado(int estado) throws Exception {
        if (estado < 1 || estado > 5) {
            throw new Exception("Estado debe estar entre 1 y 5.");
        }
        if (estado == 5 && this.estado == 1) {
            throw new Exception("Un zombi no puede pasar al ataque estando hibernando.");
        }
        this.estado = estado;
    }

    public int getEstado() {
        return this.estado;
    }

    public int getAgresividad() {
        return this.agresividad;
    }

    public void cambiarEstado(boolean subir) throws Exception {
        if (subir) {
            if (estado < 5) {
                estado++;
            } else {
                throw new Exception("El zombi ya está en el nivel máximo de actividad.");
            }
        } else {
            if (estado > 1) {
                estado--;
            } else {
                throw new Exception("El zombi ya está en el nivel mínimo de actividad.");
            }
        }
    }

    public void hibernar() {
        this.estado = 1;
    }

    public void ataque() throws Exception {
        if (estado != 1) {
            this.estado = 5;
        } else {
            throw new Exception("El zombi no puede atacar mientras está hibernando.");
        }
    }

    public Zombi clone() {
        Zombi cloned = (Zombi) super.clone();
        try {
            cloned.setEstado(this.estado);
            cloned.setAgresividad(this.agresividad);
        } catch (Exception e) {
            System.out.println("Error al clonar el zombi: " + e.getMessage());
        }
        return cloned;
    }

}
