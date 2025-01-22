import clases.Catedratico;
import clases.Persona;
import clases.Profesor;

public class App {
    public static void main(String[] args) {
        Persona p1 = new Persona("Sultán", "De Los Santos", 90);        
        Profesor profe1 = new Profesor("Alfonso", "Dos Santos Aveiro", 100, "SISIN", 5); 
        Catedratico catedra1 = new Catedratico("Manolo", "Martínez", "FOL", 40, 2500, 100);
        
        System.out.println(p1.toString());
        System.out.println(profe1.toString());
        System.out.println(catedra1.toString());
    }
}
