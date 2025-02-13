
// import clases.Individuo;
// import clases.Inmortal;
// import clases.Mortal;
import clases.Zombi;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Zombi zombi1 = new Zombi(2, 3);
            System.out.println("Zombi creado con éxito.");
            System.out.println("Estado inicial: " + zombi1.getEstado());
            System.out.println("Agresividad inicial: " + zombi1.getAgresividad());

            zombi1.cambiarEstado(true);
            System.out.println("Estado después de subir: " + zombi1.getEstado());

            zombi1.cambiarEstado(false);
            System.out.println("Estado después de bajar: " + zombi1.getEstado());

            zombi1.hibernar();
            System.out.println("Estado después de hibernar: " + zombi1.getEstado());

            try {
                zombi1.ataque();
            } catch (Exception e) {
                System.out.println("Error al intentar atacar: " + e.getMessage());
            }

            zombi1.cambiarEstado(true);
            zombi1.cambiarEstado(true);
            zombi1.cambiarEstado(true);
            zombi1.ataque();
            System.out.println("Estado después de atacar: " + zombi1.getEstado());

            Zombi zombiClon = zombi1.clone();
            System.out.println("Zombi clonado con éxito.");
            System.out.println("Estado del zombi clonado: " + zombiClon.getEstado());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Zombi zombiInvalido = new Zombi(4, 6);
        } catch (Exception e) {
            System.out.println("Error al crear el zombi inválido: " + e.getMessage());
        }
    }
}
