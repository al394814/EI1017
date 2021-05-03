package Proyecto.Tareas.Facturaciones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsumoInternoTest {

    @Test
    void devuelvoFacturacion() {
        CalculoFacturacion calculoFacturacion = new ConsumoInterno();
        int coste = 200;
        assertEquals(coste,calculoFacturacion.DevuelvoFacturacion(200));
    }
}