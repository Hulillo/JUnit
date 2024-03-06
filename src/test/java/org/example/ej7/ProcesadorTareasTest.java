package org.example.ej7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcesadorTareasTest {

    private final ProcesadorTareas procesador = new ProcesadorTareas();


    @Test
    void ejecutarTareaLargaCorrectamente() throws InterruptedException {
        assertTimeoutPreemptively(
                // Establecer el timeout en 2000 milisegundos (2 segundos)
                java.time.Duration.ofMillis(2000),
                () -> procesador.ejecutarTareaLarga(1000)
        );
    }

    @Test
    public void ejecutarTareaLargaFallo() throws InterruptedException {
        assertTimeoutPreemptively(
                // Establecer el timeout en 1000 milisegundos (1 segundo)
                java.time.Duration.ofMillis(1000),
                () -> procesador.ejecutarTareaLarga(2000)
        );
    }
}