package laboratorio2;

public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String emitirSonido() {
        return "Miau";
    }
}
