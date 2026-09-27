package laboratorio2;

public class Main {
    public static void main(String[] args) {
        Animal[] animales = {
            new Perro("Firulais"),
            new Gato("Michi"),
            new Vaca("Lola")
        };

        System.out.println("=== ZOOLÓGICO ===");

        for (Animal animal : animales) {
            animal.presentarse();
        }
    }
}
