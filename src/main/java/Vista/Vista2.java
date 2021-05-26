package Vista;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Paneles.PanelPersonas;
import Vista.Paneles.PanelTareas;

import javax.swing.*;
import java.awt.*;

public class Vista2 extends Vista
{


    private PanelPersonas vistaPersonas;
    private PanelTareas vistaTareas;
    private Controlador controlador;
    private Modelo modelo;
    private JFrame ventana;
    public  Vista2(Controlador controlador, Modelo modelo, String nombre){
        ventana = new JFrame(nombre);
        this.controlador= controlador;
        this.modelo = modelo;
        //Image icono = Toolkit.getDefaultToolkit().getImage("src/media/icono.png"); //Creamos una IMAGE
       // ventana.setIconImage(icono); //Añadimos la IMAGE creada
        JTabbedPane pestanyas = new JTabbedPane();
        vistaTareas = new PanelTareas(controlador, modelo, ventana);
        vistaPersonas = new PanelPersonas(controlador, modelo, ventana);
        pestanyas.add("Personas", vistaPersonas);
        pestanyas.add("Tareas", vistaTareas);



        ventana.add(pestanyas);
        ventana.pack();
        ventana.setVisible(true);// hacemos la ventsana visibel

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
