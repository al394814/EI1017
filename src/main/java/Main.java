import Controlador.Controlador;
import Modelo.Proyecto.Proyecto;
import Vista.Vista;

import java.awt.*;

public class Main {

    public static void main(String[] args){
        Proyecto modelo = new Proyecto();
        Controlador controlador = new Controlador();
        Vista vista = new Vista();

        vista.setControlador(controlador);
        vista.setModelo(modelo);

        vista.run();
    }
}
