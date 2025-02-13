import java.util.ArrayList;

import clases.Asesor;
import clases.Contratado;
import clases.Empresario;
import clases.Obrero;

public class App {
    public static void main(String[] args) throws Exception {
        Obrero ob1 = new Obrero();
        Obrero obrerita;
        Empresario emp1 = new Empresario();
        Empresario emp2 = new Empresario(emp1);

        Contratado con1 = new Contratado();
        Contratado con2 = new Contratado(con1);

        Asesor as1 = new Asesor("CODIGO MIGUS", "MIGUS_EMP", 1500, false, 0, 9, "PROGRAMADOR");
        Asesor as2 = new Asesor("CODIGO MIGUS", "MIGUS_EMP", 1500, false, 0, 9, "DISEÑADOR");

        ArrayList<Obrero> empresa = new ArrayList<Obrero>();
        empresa.add(as1);
        empresa.add(con1);
        empresa.add(emp1);

        if (emp1.equals(emp2)) {
            System.out.println("Los empresarios son iguales");
        }

        if (con1.equals(con2)) {
            System.out.println("Los contratados son iguales");
        }

        if (as1.equals(as2)) {
            System.out.println("Los asesores son iguales");
        } else {
            System.out.println("Los asesores son distintos");
        }

        // EJERCICIO 2.
        System.out.println("<--------------- EJERCICIO 2.1 ---------------->");
        Todo(ob1);
        Todo(emp1);
        Todo(con1);
        Todo(as1);

        System.out.println("<--------------- EJERCICIO 2.2 ---------------->");
        if (con1 instanceof Contratado) {
            System.out.println(con1.getTipoDeContrato());
        }

        if (as1 instanceof Contratado) {
            System.out.println(as1.getTipoDeContrato());
        }

        System.out.println("<--------------- EJERCICIO 2.3 ---------------->");
        for (int i = 0; i < empresa.size(); i++) {
            // Muestra la especialidad de A.
            if (empresa.get(i) instanceof Asesor) {
                Asesor a = (Asesor) empresa.get(i);
                System.out.println(a.getEspecialidad());
            }

            // Muestra beneficios totales de E.
            if (empresa.get(i) instanceof Empresario) {
                Empresario e = (Empresario) empresa.get(i);
                System.out.println(e.getTotalBeneficios(e.getPorcentaje()) + "% de beneficios.");
            }
        }

        // Mostrar los beneficios totales del Obrero que gana más entre A y C.
        if (as1.getSueldo() > con1.getSueldo()) {
            System.out.println("Beneficios de as1: " + as1.getSueldo());
        } else if (as1.getSueldo() == con1.getSueldo()) {
            System.out.println("Cobran lo mismo as1 y con1: " + as1.getSueldo());
        } else {
            System.out.println("Beneficios de con1: " + con1.getSueldo());
        }

        // Crea un Obrero obrerita con los mismos valores que el Contratado C.
        obrerita = new Obrero(con1);

        // En el main de la clase prueba baja en 100 euros el sueldo a C.
        con1.setSueldo(con1.getSueldo() - 100);

        // Comprobar si A es fijo discontinuo
        if (as1.getTipoDeContrato().equals("fijo discontinuo")) {
            System.out.println(as1.getCodigo() + " tiene un contrato fijo discontinuo");
        } else {
            System.out.println(as1.getCodigo() + " tiene un contrato que no es fijo discontinuo");
        }

        // Mostrar la empresa y la cantidad de meses que trabaja el segundo Obrero de la
        // empresa (dando por hecho que es que es un Contratado).
        for (int i = 0; i < empresa.size(); i++) {
            if (i == 2) {
                System.out.println("Empresa de " + empresa.get(i).getCodigo() + ": " + empresa.get(i).getEmpresa());
            }
        }

        /*
         * Si también tenemos
         * Obrero obrero {
         * Contratado currito=new Contratado(……………….)
         * Obrero=currito;
         */

        Obrero obrero;
        Contratado currito = new Contratado();
        obrero = currito;

        // Comprobar si el currito es fijo discontinuo
        if (currito.getTipoDeContrato().equals("fijo discontinuo")) {
            System.out.println("El obrero " + as1.getCodigo() + " tiene un contrato fijo discontinuo");
        }

        // Al contratado le cambia el código a "Con2425"
        obrero.setCodigo("Con2425"); // Desde obrero.
        currito.setCodigo("Con2425"); // Desde currito.
        
        // Ejecutar el método Todo para currito.
        Todo(currito);
    }

    public static void Todo(Object obj) {
        if (obj instanceof Obrero) {
            System.out.println(obj.toString());
        }
    }
}
