package org.example.ej17;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class ClienteServicioWebTest {

    @Test
    public void obtenerInformacionUsuario_DatosUsuarioValidos() {
        // Creamos un mock del ServicioWeb
        ServicioWeb servicioWebMock = mock(ServicioWeb.class);

        // Configuramos el comportamiento esperado del mock
        when(servicioWebMock.obtenerDatosUsuario("userId123")).thenReturn("Información del usuario");

        // Creamos una instancia de ClienteServicioWeb con el mock
        ClienteServicioWeb cliente = new ClienteServicioWeb(servicioWebMock);

        // Probamos el método obtenerInformacionUsuario
        String resultado = cliente.obtenerInformacionUsuario("userId123");

        // Verificamos que el resultado sea el esperado
        assertEquals("Información del usuario", resultado);
    }

    @Test
    public void obtenerInformacionUsuario_UsuarioNoEncontrado() {
        ServicioWeb servicioWebMock = mock(ServicioWeb.class);

        when(servicioWebMock.obtenerDatosUsuario("userId456")).thenReturn(null);

        ClienteServicioWeb cliente = new ClienteServicioWeb(servicioWebMock);

        String resultado = cliente.obtenerInformacionUsuario("userId456");

        assertNull(resultado);
    }

    @Test
    public void obtenerInformacionUsuario_ErrorDeServicio() {
        ServicioWeb servicioWebMock = mock(ServicioWeb.class);

        when(servicioWebMock.obtenerDatosUsuario(anyString())).thenThrow(new RuntimeException("Error de servicio"));

        ClienteServicioWeb cliente = new ClienteServicioWeb(servicioWebMock);

        assertThrows(RuntimeException.class, () -> {
            cliente.obtenerInformacionUsuario("userId789");
        });
    }
}