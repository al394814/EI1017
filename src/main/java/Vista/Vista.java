package Vista;

import Controlador.Controlador;
import Modelo.Modelo;
import Modelo.Proyecto.Proyecto;

import Vista.Paneles.PanelPersonas;
import Vista.Paneles.PanelTareas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Vista implements InterfaceVista{

    private Controlador controlador;
    private Modelo modelo;
    private Proyecto proyecto;
    private JFrame ventanaAcceso = new JFrame("Acceso Proyecto");
    //private JFrame ventanaPrincipal = new JFrame("Gestor Proyecto");
    private PanelPersonas vistaPersonas;
    private PanelTareas vistaTareas;
    public void setControlador(Controlador controlador) {
        this.controlador=controlador;
    }

    @Override
    public void setModelo(Modelo modelo) {
        this.modelo= modelo;

    }




    public void run() throws IOException {

        Container contenedor = ventanaAcceso.getContentPane();
        JTextField nombreProyecto = new JTextField(20);
        JLabel proyectoLabel = new JLabel("INTRODUCE EL NOMBRE DEL PROYECTO: ");
        JButton aceptar = new JButton("Aceptar");
        contenedor.setLayout(new FlowLayout());
        contenedor.add(proyectoLabel);
        contenedor.add(nombreProyecto);
        contenedor.add(aceptar);
        ventanaAcceso.pack();

        ventanaAcceso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaAcceso.setVisible(true);


        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Proyecto proyecto;
                proyecto = Proyecto.creadorProyecto(nombreProyecto.getText());
                modelo.setProyecto(proyecto);
                new Vista2(controlador, modelo, nombreProyecto.getText());

            }
        });

    }




   /* public void guardarProyecto(String nombre) throws IOException {
        FileOutputStream fos = new FileOutputStream(nombre+".bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(proyecto);
        oos.close();
    }*/
}
