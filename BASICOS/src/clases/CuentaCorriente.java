package clases;

public class CuentaCorriente {
    private String numero;
    private String dni;
    private double saldo;

    // Constructor
    public CuentaCorriente(String numero, String dni, double saldo) {
        this.numero = numero;
        this.dni = dni;
        this.saldo = saldo;
    }

    // Métodos setters
    public void setNumero(String numero) { this.numero = numero; }
    public void setDni(String dni) { this.dni = dni; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    // Métodos getters
    public String getNumero() { return this.numero; }
    public String getDni() { return this.dni; }
    public double getSaldo() { return this.saldo; }

    // Método toString
    public String toString() {
        return "Cuenta Corriente Nº " + this.getNumero() + "\nDNI: " + this.getDni() + "\nSaldo: " + this.getSaldo() + " EUR";
    }

    // Método para realizar un depósito
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Depósito realizado: " + cantidad + " EUR");
        } else {
            System.out.println("Cantidad inválida para depósito.");
        }
    }

    // Método para realizar un retiro
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
            System.out.println("Retiro realizado: " + cantidad + " EUR");
        } else {
            System.out.println("Cantidad inválida para retiro o saldo insuficiente.");
        }
    }
}
