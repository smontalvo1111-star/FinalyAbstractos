# Laboratorio 3 — Sistema de empleados

## Objetivo
Integrar `final`, clases abstractas, métodos abstractos y sobrecarga.

## Lo realizado

- Clase abstracta `Empleado`.
- `final String cedula`.
- `String nombre`.
- Constante `public static final double SALARIO_MINIMO`.
- Método abstracto `calcularSalario()`.
- Sobrecarga con `calcularSalario(int horasExtra)`.
- Método `final void mostrarCedula()`.
- Clases `Vendedor` y `Administrativo` implementando ambas versiones del cálculo.
- `Main.java` utiliza un arreglo `Empleado[]`.
- `Administrativo` se declaró `final class` como pide el reto extra.

## Importante sobre el salario
La guía no define fórmulas, valores de salario, comisión ni valor de hora extra. Por eso esta solución usa datos de prueba y recibe esos valores por constructor para mantener el ejercicio flexible.

La constante `SALARIO_MINIMO` también es exigida por la guía, pero la guía no da un valor específico. Se dejó en `0.0` únicamente para que la estructura solicitada compile sin inventar un valor oficial.
