package Modelo.Proyecto.Tareas.Facturaciones;

import java.io.Serializable;

public class Descuento implements CalculoFacturacion,Serializable {

    private static final double descuento=0.85;

    public double DevuelvoFacturacion(double coste) {
        return coste*descuento;
    }
}
