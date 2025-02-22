package pruebas;

import clases.Mortal;

/**
 * PruebaMortal
 */
public class PruebaMortal {

    public static void main(String[] args) {
        Mortal mortal1 = new Mortal(1, "Juan", 1980, "Carpintero");
        
        // Probar Getters
        System.out.println("ID: " + mortal1.getId()); // 1
        System.out.println("Nombre: " + mortal1.getNombre()); // Juan
        System.out.println("Nacimiento: " + mortal1.getNacimiento()); // 1980
        System.out.println("Trabajo: " + mortal1.getTrabajo()); // Carpintero

        // Probar Setters
        mortal1.setId(2);
        mortal1.setNombre("Pedro");
        mortal1.setNacimiento(1995);
        mortal1.setTrabajo("Electricista");
        
        System.out.println("Después de usar setters:");
        System.out.println("ID: " + mortal1.getId()); // 2
        System.out.println("Nombre: " + mortal1.getNombre()); // Pedro
        System.out.println("Nacimiento: " + mortal1.getNacimiento()); // 1995
        System.out.println("Trabajo: " + mortal1.getTrabajo()); // Electricista

        // Probar toString()
        System.out.println("Prueba toString():");
        System.out.println(mortal1.toString()); // El mortal Pedro trabaja como Electricista.

        // Probar equals()
        Mortal mortal2 = new Mortal(2, "Pedro", 1995, "Electricista");
        System.out.println("Prueba equals():");
        System.out.println("¿Son iguales? " + mortal1.equals(mortal2)); // true

        // Probar clone()
        Mortal mortalClon = mortal1.clone();
        System.out.println("Prueba clone():");
        System.out.println("Original: " + mortal1);
        System.out.println("Clon: " + mortalClon);
        System.out.println("¿El clon tiene los mismos valores? " + mortal1.equals(mortalClon)); // true
    }
}
