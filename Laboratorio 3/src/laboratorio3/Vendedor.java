package laboratorio3;

public class Vendedor extends Empleado {
    private final double salarioBase;
    private final double comision;
    private final double valorHoraExtra;

    public Vendedor(
            String cedula,
            String nombre,
            double salarioBase,
            double comision,
            double valorHoraExtra
    ) {
        super(cedula, nombre);
        this.salarioBase = salarioBase;
        this.comision = comision;
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comision;
    }

    @Override
    public double calcularSalario(int horasExtra) {
        return calcularSalario() + (horasExtra * valorHoraExtra);
    }
}
