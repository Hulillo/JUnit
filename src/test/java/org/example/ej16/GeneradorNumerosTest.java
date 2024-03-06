package org.example.ej16;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

class GeneradorNumerosTest {

    private final GeneradorNumeros generador = new GeneradorNumeros();

    @RepeatedTest(10)
    void generarNumeroAleatorioEnRango() {
        int min = generador.generarNumeroAleatorioEnRango(1, 100);
        int max = generador.generarNumeroAleatorioEnRango(min + 1, min + 100);
        int numeroAleatorio = generador.generarNumeroAleatorioEnRango(min, max);

        assertTrue(numeroAleatorio >= min && numeroAleatorio <= max,
                "El número aleatorio generado no está dentro del rango especificado");
    }

    @RepeatedTest(10)
    void esPar() {
        int numeroAleatorio = generador.generarNumeroAleatorioEnRango(Integer.MIN_VALUE, Integer.MAX_VALUE);
        boolean esperado = numeroAleatorio % 2 == 0;
        boolean resultado = generador.esPar(numeroAleatorio);

        assertEquals(esperado, resultado,
                "El resultado de esPar no coincide con la paridad del número generado aleatoriamente");
    }
}