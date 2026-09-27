package laboratorio2;

public abstract class Animal {
    protected final String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract String emitirSonido();

    public void presentarse() {
        System.out.println("Soy " + nombre + " y hago: " + emitirSonido());
    }
}
