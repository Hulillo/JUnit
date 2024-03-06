package org.example.ej18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcesadorTareasPesadasTest {

    private final ProcesadorTareasPesadas procesador = new ProcesadorTareasPesadas();

    @Test
    void realizarOperacionIntensiva() {
        long tiempoInicial = System.currentTimeMillis();
        long resultado = procesador.realizarOperacionIntensiva();
        long tiempoTranscurrido = System.currentTimeMillis() - tiempoInicial;

        assertNotNull(resultado);

        assertTrue(tiempoTranscurrido < 5000,
                "El tiempo de ejecución excede el límite aceptable");
    }
}