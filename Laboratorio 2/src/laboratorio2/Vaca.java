package laboratorio2;

public class Vaca extends Animal {
    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public String emitirSonido() {
        return "Muuu";
    }
}
