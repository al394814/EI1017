import Controlador.Controlador;
import Modelo.Modelo;
import Modelo.Proyecto.Proyecto;
import Vista.Vista;

import javax.management.modelmbean.ModelMBean;
import java.awt.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador();
        Vista vista = new Vista();

        controlador.setVista(vista);
        controlador.setModelo(modelo);

        vista.setControlador(controlador);
        vista.setModelo(modelo);

        modelo.setVista(vista);

        vista.run();

    }
}
