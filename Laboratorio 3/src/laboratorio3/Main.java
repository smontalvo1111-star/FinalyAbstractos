package laboratorio3;

public class Main {
    public static void main(String[] args) {
        // Valores de prueba para demostrar el funcionamiento.
        Empleado[] empleados = {
            new Vendedor(
                "1001",
                "Laura",
                1800000,
                350000,
                15000
            ),
            new Administrativo(
                "1002",
                "Sebastián",
                2200000,
                18000
            )
        };

        System.out.println("=== SISTEMA DE EMPLEADOS ===");

        for (Empleado empleado : empleados) {
            empleado.mostrarDatos();
            System.out.println("Salario normal: " + empleado.calcularSalario());
            System.out.println("Salario con 5 horas extra: " + empleado.calcularSalario(5));
            System.out.println("------------------------------");
        }
    }
}
