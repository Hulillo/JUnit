package org.example.ej6;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraAvanzadaTest {

    @Test
    void raizCuadrada() {
        CalculadoraAvanzada calc = new CalculadoraAvanzada();
        double resultado = calc.raizCuadrada(9);
        assertEquals(3.0, resultado);
    }

    @Disabled("Implementación pendiente o en revisión")
    @Test
    void logaritmoNatural() {
        CalculadoraAvanzada calc = new CalculadoraAvanzada();
        double resultado = calc.logaritmoNatural(10);
        assertEquals(2.302585092994046, resultado);
    }

    @Test
    void factorial() {
        CalculadoraAvanzada calc = new CalculadoraAvanzada();
        long resultado = calc.factorial(5);
        assertEquals(120, resultado);
    }
}