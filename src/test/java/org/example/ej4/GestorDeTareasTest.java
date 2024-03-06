package org.example.ej4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GestorDeTareasTest {
    private GestorDeTareas gestor;
    @BeforeEach
    public void setUp() {
        gestor = new GestorDeTareas();
        gestor.agregarTarea("Tarea 1");
        gestor.agregarTarea("Tarea 2");
    }

    @Test
    void agregarTarea() {
        gestor.agregarTarea("Tarea 3");
        List<String> tareas = gestor.obtenerTareas();
        assertTrue(tareas.contains("Tarea 3"));
    }

    @Test
    void eliminarTarea() {
        assertTrue(gestor.eliminarTarea("Tarea 1"));
        List<String> tareas = gestor.obtenerTareas();
        assertFalse(tareas.contains("Tarea 1"));
    }

    @Test
    void obtenerTareas() {
        List<String> tareas = gestor.obtenerTareas();
        assertEquals(2, tareas.size());
        assertTrue(tareas.contains("Tarea 1"));
        assertTrue(tareas.contains("Tarea 2"));
    }

    @Test
    void limpiarTareas() {
        gestor.limpiarTareas();
        List<String> tareas = gestor.obtenerTareas();
        assertTrue(tareas.isEmpty());
    }

    @AfterEach
    public void tearDown() {
        gestor.limpiarTareas();
    }
}