package Proyecto.Tareas.Facturaciones;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrgenteTest {

    private static final double descuento=1.15;

    @Test
    void devuelvoFacturacion() {
        CalculoFacturacion calculoFacturacion = new Urgente();

        int coste = 100;
        assertEquals(coste*descuento,calculoFacturacion.DevuelvoFacturacion(coste),0.01);
    }
}