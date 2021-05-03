package Proyecto.Tareas.Facturaciones;

import java.io.Serializable;

public class Urgente implements  CalculoFacturacion ,Serializable {

    private static final double incremento=1.15;

    public double DevuelvoFacturacion(double coste) {
        return coste*incremento;
    }
}
