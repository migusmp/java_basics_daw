// NO SE VAN A PODER CREAR CODIGOS CON MAS DE 4 NÚMEROS Y 2 LETRAS.
// EL CODIGO TIENE QUE EMPEZAR POR i
public class Id {
    private int max_chars = 6;
    private int numeros;
    private int letras;
    private String codigo;

    public Id() {
        this.codigo = "ia2398";
    }

    public Id(String codigo) throws Exception {
        procesoDeValidacion(codigo);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) throws Exception {
        procesoDeValidacion(codigo);
        this.codigo = codigo;
    }

    private void verificarCodigoValido(String codigo) throws Exception {
        if (!codigo.startsWith("i")) {
            throw new Exception("EL CÓDIGO A CREAR DEBE DE EMPEZAR POR LA LETRA 'i'");
        }

        if (codigo.length() > max_chars) {
            throw new Exception("EL CÓDIGO NO PUEDE TENER MÁS DE 6 CARATCERES");
        }
    }

    private void getCharsOfCodigo(String codigo) throws Exception {
        for (int i = 0; i < codigo.length(); i++) {
            if (codigo.charAt(i) >= 48 && codigo.charAt(i) <= 57) {
                numeros++;
            }
            if (codigo.charAt(i) >= 97 && codigo.charAt(i) <= 122) {
                letras++;
            }
            if (codigo.charAt(i) >= 65 && codigo.charAt(i) <= 90) {
                letras++;
            }
        }

    }

    private void checkNumerosLetras() throws Exception {
        if (numeros > 4) {
            throw new Exception("EL CÓDIGO NO PUEDE SUPERAR LOS 4 NÚMEROS");
        }
        if (letras > 2) {
            throw new Exception("EL CÓDIGO NO PUEDE CONTENER MÁS DE 2 LETRAS");
        }
    }
    
    private void procesoDeValidacion(String codigo) throws Exception {
        // VERIFICAR QUE EL CÓDIGO CUMPLA CON LA LONGITUD Y QUE EMPIECE POR i.
        verificarCodigoValido(codigo);

        // OBTENER LOS CHARS DEL CÓDIGO Y CLASIFICARLOS.
        getCharsOfCodigo(codigo);

        // COMPROBAR EL NÚMERO DE CARATCERES Y DE NÚMEROS QUE TIENE LA CADENA.
        checkNumerosLetras();
    }
}
