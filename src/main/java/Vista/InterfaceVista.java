package Vista;

import Controlador.Controlador;
import Modelo.InterfaceModelo;
import Modelo.Proyecto.Proyecto;

public interface InterfaceVista {
    void setControlador(Controlador controlador);
    void setModelo(Proyecto proyecto);
}
