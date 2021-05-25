package Modelo.Proyecto.Tareas.Facturaciones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacturacionTest {

    @Test
    void getCalculoFacturacion() {
        CalculoFacturacion calculoFacturacion = new ConsumoInterno();
        Facturacion facturacion =  new Facturacion(calculoFacturacion);
        assertEquals(100,facturacion.getCalculoFacturacion(100));
    }
}