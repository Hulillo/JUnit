package org.example.ej13;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class GestorDeTareasTest {

    @Nested
    class TestAgregarTarea {

        @Test
        void agregarTareaExitoso() {
            GestorDeTareas gestor = new GestorDeTareas();
            gestor.agregarTarea("1", "Tarea de ejemplo");
            Optional<String> descripcion = gestor.buscarTareaPorId("1");
            assertTrue(descripcion.isPresent());
            assertEquals("Tarea de ejemplo", descripcion.get());
        }
    }

    @Nested
    class TestEliminarTarea {

        @Test
        void eliminarTareaExitoso() {
            GestorDeTareas gestor = new GestorDeTareas();
            gestor.agregarTarea("1", "Tarea de ejemplo");
            assertTrue(gestor.eliminarTarea("1"));
            assertFalse(gestor.buscarTareaPorId("1").isPresent());
        }

        @Test
        void eliminarTareaNoExiste() {
            GestorDeTareas gestor = new GestorDeTareas();
            assertFalse(gestor.eliminarTarea("1"));
        }
    }

    @Nested
    class TestBuscarTareaPorId {

        @Test
        void buscarTareaPorIdExitoso() {
            GestorDeTareas gestor = new GestorDeTareas();
            gestor.agregarTarea("1", "Tarea de ejemplo");
            Optional<String> descripcion = gestor.buscarTareaPorId("1");
            assertTrue(descripcion.isPresent());
            assertEquals("Tarea de ejemplo", descripcion.get());
        }

        @Test
        void buscarTareaPorIdNoExiste() {
            GestorDeTareas gestor = new GestorDeTareas();
            Optional<String> descripcion = gestor.buscarTareaPorId("1");
            assertFalse(descripcion.isPresent());
        }
    }
}