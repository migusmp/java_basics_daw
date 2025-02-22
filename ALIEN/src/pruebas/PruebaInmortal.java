package pruebas;

import clases.Inmortal;
import clases.Mortal;

/**
 * PruebaInmortal
 */
public class PruebaInmortal {

    public static void main(String[] args) {
        Mortal criado = new Mortal(3, "Carlos", 2000, "Jardinero");

        try {
            // PRUEBAS
            Inmortal inmortal1 = new Inmortal(1, "Zeus", 1000, "rey", criado);

            // Probar Getters
            System.out.println("ID: " + inmortal1.getId());
            System.out.println("Nombre: " + inmortal1.getNombre());
            System.out.println("Nacimiento: " + inmortal1.getNacimiento());
            System.out.println("Rango: " + inmortal1.getRango());
            System.out.println("Criado: " + inmortal1.getCriado().getNombre());

            // Probar Setters
            try {
                inmortal1.setRango("noble");
            } catch (Exception e) {
                System.out.println("Error al establecer rango: " + e.getMessage());
            }

            inmortal1.setCriado(new Mortal(4, "Hermes", 1995, "Mensajero"));

            System.out.println("Después de usar setters:");
            System.out.println("Rango: " + inmortal1.getRango());
            System.out.println("Criado: " + inmortal1.getCriado().getNombre());

            // Probar toString()
            System.out.println("Prueba toString():");
            System.out.println(inmortal1.toString());

            // Probar equals()
            Inmortal inmortal2 = new Inmortal(1, "Zeus", 1000, "noble", new Mortal(4, "Hermes", 1995, "Mensajero"));
            System.out.println("Prueba equals():");
            System.out.println("¿Son iguales? " + inmortal1.equals(inmortal2));

            // Probar clone()
            Inmortal inmortalClon = inmortal1.clone();
            System.out.println("Prueba clone():");
            System.out.println("Original: " + inmortal1);
            System.out.println("Clon: " + inmortalClon);
            System.out.println("¿El clon tiene los mismos valores? " + inmortal1.equals(inmortalClon));

        } catch (Exception e) {
            System.out.println("Error al crear el Inmortal: " + e);
        }
    }
}
