package laboratorio2;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String emitirSonido() {
        return "Guau";
    }
}
