package org.example.ej15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControladorAccesoTest {

    @Test
    void asignarRolAUsuario() {
        ControladorAcceso controlador = new ControladorAcceso();

        controlador.asignarRolAUsuario("usuario1", "ADMIN");
        assertEquals("ADMIN", controlador.usuariosYRoles.get("usuario1"));

        controlador.asignarRolAUsuario("usuario1", "EDITOR");
        assertEquals("EDITOR", controlador.usuariosYRoles.get("usuario1"));
    }

    @Test
    void verificarAcceso() {
        ControladorAcceso controlador = new ControladorAcceso();

        controlador.asignarRolAUsuario("adminUser", "ADMIN");
        assertTrue(controlador.verificarAcceso("adminUser", "GESTION_USUARIOS"));
        assertTrue(controlador.verificarAcceso("adminUser", "CONSULTA"));

        controlador.asignarRolAUsuario("editorUser", "EDITOR");
        assertTrue(controlador.verificarAcceso("editorUser", "CONSULTA"));
        assertFalse(controlador.verificarAcceso("editorUser", "GESTION_USUARIOS"));

        controlador.asignarRolAUsuario("visitanteUser", "VISITANTE");
        assertTrue(controlador.verificarAcceso("visitanteUser", "CONSULTA"));
        assertFalse(controlador.verificarAcceso("visitanteUser", "GESTION_USUARIOS"));

        assertFalse(controlador.verificarAcceso("userSinRol", "CONSULTA"));
        assertFalse(controlador.verificarAcceso("userSinRol", "GESTION_USUARIOS"));

        controlador.asignarRolAUsuario("unknownRoleUser", "UNKNOWN_ROLE");
        assertFalse(controlador.verificarAcceso("unknownRoleUser", "CONSULTA"));
        assertFalse(controlador.verificarAcceso("unknownRoleUser", "GESTION_USUARIOS"));
    }
}