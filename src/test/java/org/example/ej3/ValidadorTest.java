package org.example.ej3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorTest {

    @Test
    void validarTexto() {
        Validador validador = new Validador();
        try {
            validador.validarTexto("Hola qué tal");
            assertTrue(true);
        } catch (TextoInvalidoException e) {
            fail("Excepción: " + e.getMessage());
        }
    }
}