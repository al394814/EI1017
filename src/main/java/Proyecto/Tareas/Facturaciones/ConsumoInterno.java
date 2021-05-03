package Proyecto.Tareas.Facturaciones;

import java.io.Serializable;

public class ConsumoInterno implements CalculoFacturacion, Serializable {
    public double DevuelvoFacturacion(double coste) {
        return coste;
    }
}
