package org.example.ej12;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("ComponenteB")
class ComponenteBTest {

    @Test
    void operacionB() {
        ComponenteB componenteB = new ComponenteB();
        assertEquals(42, componenteB.operacionB());
    }
}