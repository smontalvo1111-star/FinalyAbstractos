package laboratorio1;

public class Tarjeta {
    // Estos datos no deberían cambiar después de crear la tarjeta.
    private final String numero;
    private final String titular;

    // El saldo sí cambia con el tiempo.
    private double saldo;

    // Constante compartida por todas las tarjetas.
    public static final String BANCO = "Banco Central";

    public Tarjeta(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("El monto debe ser mayor que cero.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Banco: " + BANCO);
        System.out.println("Número: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    /*
    Reto extra de la guía:

    Si se intentara hacer esto dentro de la clase:

        numero = "999999";

    Java mostraría un error de compilación porque numero es final.
    */
}
