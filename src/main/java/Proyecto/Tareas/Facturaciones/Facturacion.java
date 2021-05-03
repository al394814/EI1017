package Proyecto.Tareas.Facturaciones;

import java.io.Serializable;

public class Facturacion implements Serializable {

    private CalculoFacturacion calculoFacturacion;

    public Facturacion(CalculoFacturacion calculoFacturacion) {
        this.calculoFacturacion = calculoFacturacion;
    }

    public double getCalculoFacturacion(double coste) {
        return calculoFacturacion.DevuelvoFacturacion(coste);
    }

    public void setCalculoFacturacion(CalculoFacturacion calculoFacturacion) {
        this.calculoFacturacion = calculoFacturacion;
    }
}
