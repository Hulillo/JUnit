package org.example.ej12;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("ComponenteA")
class ComponenteATest {

    @Test
    void operacionA() {
        ComponenteA componenteA = new ComponenteA();
        assertEquals("Resultado de operación A", componenteA.operacionA());
    }
}