package laboratorio2;

public class Pez extends Animal {
    public Pez(String nombre) {
        super(nombre);
    }

    // Primera forma de corregir el reto:
    // implementar el método abstracto heredado.
    @Override
    public String emitirSonido() {
        return "Blub blub";
    }
}
