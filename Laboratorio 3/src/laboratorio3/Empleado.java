package laboratorio3;

public abstract class Empleado {
    protected final String cedula;
    protected String nombre;

    // La guía pide la constante, pero no especifica un valor numérico.
    // Se deja en 0.0 únicamente como valor neutro para que el ejemplo compile.
    public static final double SALARIO_MINIMO = 0.0;

    public Empleado(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public abstract double calcularSalario();

    // Sobrecarga: mismo nombre, parámetros diferentes.
    public abstract double calcularSalario(int horasExtra);

    public final void mostrarCedula() {
        System.out.println("Cédula: " + cedula);
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        mostrarCedula();
    }
}
