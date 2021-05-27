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

        JTabbedPane pestanyas = new JTabbedPane();
        vistaTareas = new PanelTareas(controlador, modelo, ventana);
        vistaPersonas = new PanelPersonas(controlador, modelo, ventana, nombre);
        pestanyas.add("Personas", vistaPersonas);
        pestanyas.add("Tareas", vistaTareas);

        ventana.add(pestanyas);
        ventana.pack();
        ventana.setVisible(true);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}
