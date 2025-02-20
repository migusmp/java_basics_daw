public class App {
    public static void main(String[] args) throws Exception {
        // ERROR DE QUE EL CODIGO DEBE DE EMPEZAR POR i. 
        try {
            Id codigo = new Id("T1273a");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // ERROR DE MUCHOS CARACTERES
        try {
            Id codigo = new Id("i1273a2");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // ERROR DE MUCHOS NÚMEROS
        try {
            Id codigo = new Id("i12733");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // ERROR DE MUCHAS LETRAS;
        try {
            Id codigo = new Id("iee733");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // GUARDA EL CÓDIGO Y SE PUEDE ACCEDER A ÉL.
        Id codigo = new Id("ie3456");
        System.out.println("CÓDIGO VÁLIDO: " + codigo.getCodigo());

        // SET DE CODIGO;
        Id codigo = new Id();

    }
}
