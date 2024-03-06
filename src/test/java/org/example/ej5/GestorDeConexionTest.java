package org.example.ej5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GestorDeConexionTest {

    @BeforeAll
    public static void initAll(){
        GestorDeConexion.abrirConexion();
    }

    @Test
    void abrirConexion() {
    }

    @Test
    void cerrarConexion() {
    }

    @AfterAll
    public static void cleanUpAll(){
        GestorDeConexion.cerrarConexion();
    }
}