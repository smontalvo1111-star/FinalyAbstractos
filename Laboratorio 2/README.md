# Laboratorio 2 — El zoológico

## Objetivo
Crear una jerarquía abstracta funcional.

## Lo realizado

- `Animal` es una clase `abstract`.
- Tiene la propiedad `final String nombre` y su constructor.
- Declara:

```java
public abstract String emitirSonido();
```

- Incluye el método concreto `presentarse()`.
- Se crearon `Perro`, `Gato` y `Vaca`, cada uno con su propia implementación de `emitirSonido()`.
- `Main.java` guarda los objetos en un arreglo `Animal[]` y los recorre usando polimorfismo.

## Reto extra
La guía plantea crear un `Pez` que inicialmente no implemente `emitirSonido()`.

Las dos formas de corregirlo están representadas así:

1. `Pez.java`: implementa `emitirSonido()`.
2. `PezAbstracto.java`: se declara también como clase `abstract`, por lo que no está obligada todavía a implementar el método.
