import java.util.Arrays;
import clases.*;

public class App {
    public static void main(String[] args) {

        String[] componentes = { "Grafica", "Procesador" };          //
        String[] componentes_extra = { "Disquetera", "Placa base" }; //
                                                                     //
        Ordenador pc1 = new Ordenador(componentes);                  //
                                                                     // CLASE ORDENADOR
        pc1.setComponente("Fuente de alimentación");                 //
        pc1.setComponentes(componentes_extra);                       //
                                                                     //
        System.out.println(pc1.toString());                          //

        
        Asignatura asig1 = new Asignatura("Programación", "Pilar", 300); //
        System.out.println(asig1.toString());                            // CLASE ASIGNATURA
                                                                         //


        Deporte d1 = new Deporte("Futbol", true);                        //
        Deporte d2 = new Deporte("Canicas", false);                      //
        System.out.println(d1.toString());                               // CLASE DEPORTE
        System.out.println(d2.toString());                               //
                                                                         //

        Patin patin1 = new Patin("G23", true, 500);                      //
        System.out.println(patin1.toString());                           // CLASE PATIN
                                                                         //
        
        Vivienda vivienda1 = new Vivienda(300, 2);                       //
        System.out.println(vivienda1.toString());                        // CLASE VIVIENDA
                                                                         //

        Seleccion selec1 = new Seleccion("España", "Fútbol", "Masculino"); //        
        System.out.println(selec1.toString());                             // CLASE SELECCIÓN
                                                                           //

        Premio premio1 = new Premio("Juan Pérez", "Deporte", 10000);       //
        Premio premio2 = new Premio("María López", "Ciencia", 20000);      //
                                                                           // CLASE PREMIO
        System.out.println(premio1.toString());                            //
        System.out.println(premio2.toString());                            //


        Prenda prenda1 = new Prenda("Camisa", "M", "Azul", 19.99);         //
        Prenda prenda2 = new Prenda("Pantalón", "L", "Negro", 29.99);      //
                                                                           // CLASE PRENDA
        System.out.println(prenda1.toString());                            //
        System.out.println(prenda2.toString());                            //


        Persona persona1 = new Persona("Juan", 30, 1.75f, "12345678A");    //
        Persona persona2 = new Persona("Ana", 25, 1.65f, "87654321B");     //
                                                                           // CLASE PERSONA
        System.out.println(persona1.toString());                           //
        System.out.println(persona2.toString());                           //


        Jugador jugador1 = new Jugador("Fútbol", 10, "Real Madrid");            //
        Jugador jugador2 = new Jugador("Baloncesto", 23, "Los Angeles Lakers"); //
                                                                                // CLASE JUGADOR
        System.out.println(jugador1.toString());                                //
        System.out.println(jugador2.toString());                                //

        CuentaCorriente cuenta1 = new CuentaCorriente("12345678", "12345678A", 1000.00);  //
                                                                                          //
        System.out.println(cuenta1.toString());                                           //
                                                                                          //
        cuenta1.depositar(500.00);                                                        //
        System.out.println("Saldo después del depósito: " + cuenta1.getSaldo() + " EUR"); // CLASE CUENTA CORRIENTE
                                                                                          //
        cuenta1.retirar(200.00);                                                          //
        System.out.println("Saldo después del retiro: " + cuenta1.getSaldo() + " EUR");   //
                                                                                          //
        cuenta1.retirar(1500.00);                                                         //
                 
        Parking parking1 = new Parking(10, "Parking Central", 0.5);                        //
                                                                                           //
        System.out.println(parking1.toString());                                           //
                                                                                           //
        parking1.aparcar();                                                                //
                                                                                           //
        double precio = parking1.calcularPrecio(120);                                      // CLASE PARKING
        System.out.println("Precio por 120 minutos de aparcamiento: " + precio + " EUR");  //
                                                                                           //
        parking1.liberar();                                                                //
                                                                                           //
        parking1.aparcar();                                                                //
        parking1.aparcar();                                                                //

        Alumno alumno1 = new Alumno("Juan", "Matemáticas", 7.5);                           //
        System.out.println(alumno1.toString());                                            // CLASE ALUMNO
                                                                                           //

        Restaurante restaurante = new Restaurante(                                         //
            "La Buena Mesa",                                                               //
            "Calle de la Gastronomía, 123",                                                //
            5,                                                                             //
            "Cocina Mediterránea",                                                         //
            "s",  // Apto para celiacos                                                    // CLASE RESTAURANTE
            Arrays.asList("Paella", "Gazpacho", "Tarta de Almendra", "Ensalada Mixta")     //
        );                                                                                 //
                                                                                           //
        // Mostrar la información del restaurante                                          //
        System.out.println(restaurante.toString());                                        //

        
        String[] paradas = {"Parada 1", "Parada 2", "Parada 3", "Parada 4"};               //
        Calle calle = new Calle("Avenida Central", "Madrid", paradas);                     // CLASE CALLE
        System.out.println(calle.toString());                                              //


        Ciudad ciudad = new Ciudad("Madrid", 3000000, true);                               //
        System.out.println(ciudad.toString());                                             // CLASE CIUDAD
                                                                                           //
    }
}
