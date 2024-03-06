package org.example.ej14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraFinancieraTest {

    private final CalculadoraFinanciera calculadora = new CalculadoraFinanciera();

    @Test
    void calcularInteresCompuesto_PrincipalPositivo() {
        assertEquals(1282.0372317085844, calculadora.calcularInteresCompuesto(1000, 0.05, 4, 5));
    }

    @Test
    void calcularInteresCompuesto_PrincipalCero() {
        assertEquals(0, calculadora.calcularInteresCompuesto(0, 0.05, 4, 5));
    }

    @Test
    void calcularInteresCompuesto_TasaInteresNegativa() {
        assertEquals(-2088.1519961340746, calculadora.calcularInteresCompuesto(-1000, 0.15, 4, 5));
    }

    @Test
    void calcularVPN_CasoGeneral() {
        double[] flujosCaja = {-1000, 200, 300, 400, 500};
        assertEquals(219.47131082213673, calculadora.calcularVPN(0.05, flujosCaja));
    }

    @Test
    void calcularVPN_CasoInversionNegativa() {
        double[] flujosCaja = {-1000, -200, 300, 400, 500};
        assertEquals(-161.48107013024418, calculadora.calcularVPN(0.05, flujosCaja));
    }

    @Test
    void calcularVPN_TasaDescuentoCero() {
        double[] flujosCaja = {-1000, 200, 300, 0, 500};
        assertEquals(0, calculadora.calcularVPN(0, flujosCaja));
    }
}