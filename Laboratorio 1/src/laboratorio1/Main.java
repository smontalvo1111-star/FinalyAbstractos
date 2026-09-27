package laboratorio1;

public class Main {
    public static void main(String[] args) {
        Tarjeta tarjeta = new Tarjeta("123456789", "Laura", 100000);

        System.out.println("=== INFORMACIÓN INICIAL ===");
        tarjeta.mostrarInformacion();

        System.out.println("\n=== DEPÓSITO ===");
        tarjeta.depositar(50000);

        System.out.println("\n=== INFORMACIÓN ACTUALIZADA ===");
        tarjeta.mostrarInformacion();
    }
}
