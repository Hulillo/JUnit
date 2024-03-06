package org.example.ej2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar() {
        assertEquals(4, 2 + 2, "2 + 2 debe ser igual a 4");
        assertEquals(2, 2 + 0, "2 + 0 debe ser igual a 2");
        assertEquals(2, 0 + 2, "0 + 2 debe ser igual a 2");
    }

    @Test
    void restar() {
        assertEquals(0, 2 - 2, "2 + 2 debe ser igual a 4");
        assertEquals(1, 2 - 1, "2 + 0 debe ser igual a 2");
        assertEquals(-2, 0 - 2, "0 + 2 debe ser igual a 2");
    }

    @Test
    void multiplicar() {
        assertEquals(4, 2 * 2, "2 + 2 debe ser igual a 4");
        assertEquals(2, 2 * 1, "2 + 0 debe ser igual a 2");
        assertEquals(0, 0 * 2, "0 + 2 debe ser igual a 2");
    }

    @Test
    void dividir() {
        assertEquals(1, 2 / 2, "2 + 2 debe ser igual a 4");
        assertEquals(2, 4 / 2, "2 + 0 debe ser igual a 2");
        assertEquals(0, 0 / 2, "0 + 2 debe ser igual a 2");
    }
}