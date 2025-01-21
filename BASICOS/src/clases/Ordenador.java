package clases;

public class Ordenador {
    private String[] componentes;
    private int garantia = 3;

    public Ordenador(String[] componentes) {
        this.componentes = componentes;
    }

    public void setComponente(String componente) {
        // Verificar si hay un hueco disponible
        for (int i = 0; i < this.componentes.length; i++) {
            if (this.componentes[i] == null) {
                this.componentes[i] = componente; // Agregar el componente en el hueco
                return;
            }
        }

        // Si no hay huecos disponibles, aumentar el array
        int nuevoTamaño = this.componentes.length + 1;
        String[] nuevosComponentes = new String[nuevoTamaño]; // Crear nuevo array

        // Copiar manualmente los elementos existentes
        for (int i = 0; i < this.componentes.length; i++) {
            nuevosComponentes[i] = this.componentes[i];
        }

        // Agregar el nuevo componente en el último espacio
        nuevosComponentes[this.componentes.length] = componente;

        // Reasignar el nuevo array al atributo
        this.componentes = nuevosComponentes;
    }

    public void setComponentes(String[] nuevosComponentes) {
        int espaciosNecesarios = 0;

        // Verificar cuántos espacios adicionales se necesitan
        for (String componente : nuevosComponentes) {
            boolean agregado = false;

            // Buscar huecos en el array actual
            for (int i = 0; i < this.componentes.length; i++) {
                if (this.componentes[i] == null) {
                    this.componentes[i] = componente;
                    agregado = true;
                    break;
                }
            }

            // Si no hay huecos, aumentar el contador de espacios necesarios
            if (!agregado) {
                espaciosNecesarios++;
            }
        }

        // Ampliar el array si es necesario
        if (espaciosNecesarios > 0) {
            String[] nuevosArray = new String[this.componentes.length + espaciosNecesarios];
            System.arraycopy(this.componentes, 0, nuevosArray, 0, this.componentes.length);

            // Agregar los componentes restantes
            int indiceNuevo = this.componentes.length;
            for (String componente : nuevosComponentes) {
                boolean agregado = false;
                for (String existente : this.componentes) {
                    if (componente.equals(existente)) {
                        agregado = true;
                        break;
                    }
                }
                if (!agregado) {
                    nuevosArray[indiceNuevo++] = componente;
                }
            }

            // Actualizar el array de componentes
            this.componentes = nuevosArray;
        }
    }

    public String toString() {
        String frase = "";
        for (int i = 0; i < this.componentes.length; i++) {
            frase += this.componentes[i] + ", ";
        }

        return frase;
    }
}
