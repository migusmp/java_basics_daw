package clases;

/**
 * Asesor
 */
public class Asesor extends Contratado {
    private String especialidad;

    public Asesor(String codigo, String empresa, int sueldo, boolean beneficios, int anios, int meses,
            String especialidad) {
        this.setCodigo(codigo);
        this.setEmpresa(empresa);
        this.setSueldo(sueldo);
        this.setBeneficios(beneficios);
        this.setAnios(anios);
        this.setMeses(meses);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String toString() {
        return "El asesor " + this.getCodigo() + " es especialista en el area " + this.especialidad
                + " y esta contratado durante " + this.getAnios() + " años y " + this.getMeses() + " meses.";
    }

}
