package Vista;

import Controlador.Controlador;
import Modelo.Proyecto.Proyecto;
import Vista.Paneles.PanelPersonas;
import Vista.Paneles.PanelTareas;

import javax.swing.*;
import java.awt.*;

public class Vista implements InterfaceVista{

    private Controlador controlador;
    private Proyecto proyecto;
    private JFrame ventanaAcceso = new JFrame("Acceso Proyecto");
    //private JFrame ventanaPrincipal = new JFrame("Gestor Proyecto");
    private PanelPersonas vistaPersonas;
    private PanelTareas vistaTareas;
    public void setControlador(Controlador controlador) {
        this.controlador=controlador;
    }

    public void setModelo(Proyecto proyecto) {
        this.proyecto=proyecto;
    }

    public void run(){
        Container contenedor = ventanaAcceso.getContentPane();
        JTextField nombreProyecto = new JTextField(20);
        JLabel proyectoLabel = new JLabel("INTRODUCE EL NOMBRE DEL PROYECTO: ");
        contenedor.setLayout(new FlowLayout());
        contenedor.add(proyectoLabel);
        contenedor.add(nombreProyecto);
        ventanaAcceso.pack();
        ventanaAcceso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaAcceso.setVisible(true);
    }
}
