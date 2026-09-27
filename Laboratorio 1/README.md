# Laboratorio 1 — La tarjeta de identificación

## Objetivo
Distinguir qué datos deben quedar sellados con `final` y cuáles pueden cambiar.

## Lo realizado

- Clase `Tarjeta` con `numero`, `titular` y `saldo`.
- `numero` y `titular` se declararon `final` porque se consideran datos que no deberían cambiar una vez creada la tarjeta.
- `saldo` queda modificable porque cambia con depósitos.
- Se agregó la constante:

```java
public static final String BANCO = "Banco Central";
```

- Se creó `depositar(double monto)`.
- En `Tarjeta.java` queda explicado el reto de intentar modificar `numero`, lo cual produciría error de compilación.
