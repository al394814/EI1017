package Proyecto.Tareas.Facturaciones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescuentoTest {

    private static final double descuento=0.85;

    @Test
    void devuelvoFacturacion() {
        CalculoFacturacion calculoFacturacion = new Descuento();
        int coste = 100;
        assertEquals(coste*descuento,calculoFacturacion.DevuelvoFacturacion(coste));
    }
}