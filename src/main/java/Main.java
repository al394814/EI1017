import Controlador.Controlador;
import Modelo.Modelo;
import Modelo.Proyecto.Proyecto;
import Vista.Vista;

import javax.management.modelmbean.ModelMBean;
import java.awt.*;

public class Main {

    public static void main(String[] args){
        Proyecto proyecto = new Proyecto();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador();
        Vista vista = new Vista();

        controlador.setVista(vista);
        controlador.setModelo(modelo);

        vista.setControlador(controlador);
        vista.setModelo(modelo);

        modelo.setVista(vista);
        modelo.setProyecto(proyecto);

        vista.run();
    }
}
