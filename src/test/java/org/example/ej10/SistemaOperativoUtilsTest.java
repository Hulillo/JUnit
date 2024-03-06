package org.example.ej10;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaOperativoUtilsTest {

    @Test
    void obtenerNombreSO() {

    }

    @Test
    void esWindows() {
        Assumptions.assumeTrue(SistemaOperativoUtils.esWindows());
        assertTrue(true);
    }

    @Test
    void esMac() {
        Assumptions.assumeTrue(SistemaOperativoUtils.esMac());
        assertTrue(true);
    }

    @Test
    void esLinux() {
        Assumptions.assumeTrue(SistemaOperativoUtils.esLinux());
        assertTrue(true);
    }
}