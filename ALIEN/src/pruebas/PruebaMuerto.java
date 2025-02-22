package pruebas;

import clases.Muerto;

/**
 * PruebaMuerto
 */
public class PruebaMuerto {

    public static void main(String[] args) {
        try {
            Muerto muerto1 = new Muerto(2, "Juan", 1980, 2020);

            // Probar Getters
            System.out.println("ID: " + muerto1.getId());
            System.out.println("Nombre: " + muerto1.getNombre());
            System.out.println("Nacimiento: " + muerto1.getNacimiento());
            System.out.println("Fallecimiento: " + muerto1.getFallecimiento());

            // Probar Setters con fecha válida
            muerto1.setFallecimiento(2025);
            System.out.println("Después de usar setter para fallecimiento:");
            System.out.println("Fallecimiento: " + muerto1.getFallecimiento());

            // Probar Setters con fecha inválida
            try {
                muerto1.setFallecimiento(1975);
            } catch (Exception e) {
                System.out.println("Error al usar setter con fecha inválida: " + e.getMessage());
            }

            // Probar toString()
            System.out.println("Prueba toString():");
            System.out.println(muerto1.toString());

            // Probar equals()
            Muerto muerto2 = new Muerto(2, "Juan", 1980, 2025);
            System.out.println("Prueba equals():");
            System.out.println("¿Son iguales? " + muerto1.equals(muerto2));

            // Probar clone()
            Muerto muertoClon = muerto1.clone();
            System.out.println("Prueba clone():");
            System.out.println("Original: " + muerto1);
            System.out.println("Clon: " + muertoClon);
            System.out.println("¿El clon tiene los mismos valores? " + muerto1.equals(muertoClon));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
