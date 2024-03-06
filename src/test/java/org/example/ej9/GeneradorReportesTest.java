package org.example.ej9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GeneradorReportesTest {

    private GeneradorReportes generadorReportes;

    @BeforeEach
    void setUp() {
        generadorReportes = new GeneradorReportes();
    }

    @Test
    void generarReporteDatosNoNulos() {
        List<String> datos = Arrays.asList("Dato 1", "Dato 2", "Dato 3");
        String reporte = generadorReportes.generarReporte(datos);
        String expected = "Reporte:\n- Dato 1\n- Dato 2\n- Dato 3\n";
        assertEquals(expected, reporte);
    }

    @Test
    void generarReporteDatosNulos() {
        List<String> datos = null;
        String reporte = generadorReportes.generarReporte(datos);
        assertEquals("Reporte vacío", reporte);
    }

    @Test
    void generarReporteConDatosVacios() {
        List<String> datos = Arrays.asList();
        String reporte = generadorReportes.generarReporte(datos);
        assertEquals("Reporte vacío", reporte);
    }
}