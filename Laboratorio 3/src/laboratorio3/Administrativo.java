package laboratorio3;

// Reto extra de la guía:
// al ser final, ninguna otra clase puede heredar de Administrativo.
public final class Administrativo extends Empleado {
    private final double salarioFijo;
    private final double valorHoraExtra;

    public Administrativo(
            String cedula,
            String nombre,
            double salarioFijo,
            double valorHoraExtra
    ) {
        super(cedula, nombre);
        this.salarioFijo = salarioFijo;
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public double calcularSalario() {
        return salarioFijo;
    }

    @Override
    public double calcularSalario(int horasExtra) {
        return calcularSalario() + (horasExtra * valorHoraExtra);
    }
}
