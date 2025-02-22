package pruebas;

import clases.Individuo;

/**
 * PruebaIndividuo
 */
public class PruebaIndividuo {
    public static void main(String[] args) {
        Individuo individuo1 = new Individuo(1, "Juan", 1980);
        // Probar Getters
        System.out.println("ID: " + individuo1.getId()); // 1
        System.out.println("Nombre: " + individuo1.getNombre()); // Juan
        System.out.println("Nacimiento: " + individuo1.getNacimiento()); // 1980

        // Probar Setters
        individuo1.setId(2);
        individuo1.setNombre("Pedro");
        individuo1.setNacimiento(1995);
        
        System.out.println("\nDespués de usar setters:");
        System.out.println("ID: " + individuo1.getId()); // 2
        System.out.println("Nombre: " + individuo1.getNombre()); // Pedro
        System.out.println("Nacimiento: " + individuo1.getNacimiento()); // 1995

        // Probar toString()
        System.out.println("\nPrueba toString():");
        System.out.println(individuo1.toString()); // Individuo: { id: 2, nombre: Pedro, nacimiento: 1995 };

        // Probar equals()
        Individuo individuo2 = new Individuo(2, "Pedro", 1995);
        System.out.println("\nPrueba equals():");
        System.out.println("¿Son iguales? " + individuo1.equals(individuo2)); // true

        // Probar clone()
        Individuo personaClon = individuo1.clone();
        System.out.println("\nPrueba clone():");
        System.out.println("Original: " + individuo1);
        System.out.println("Clon: " + personaClon);
        System.out.println("¿El clon es igual? " + individuo1.equals(personaClon)); // true    }
    }
}
