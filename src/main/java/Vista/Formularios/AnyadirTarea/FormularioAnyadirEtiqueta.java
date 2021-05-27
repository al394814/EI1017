package Vista.Formularios.AnyadirTarea;

import Controlador.Controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;

public class FormularioAnyadirEtiqueta {

    Controlador controlador;
    private JFrame formulario;
    public FormularioAnyadirEtiqueta(Controlador controlador, JTextField titulo){
        this.controlador= controlador;
        formulario = new JFrame("Añadir Cliente");
        formulario.setLayout(new GridLayout(10, 2));
        Container contenedor = formulario.getContentPane();
        JTextField nombre = new JTextField(20);
        JLabel proyectoLabel = new JLabel("INTRODUCE LA ETIQUETA: ");
        JButton aceptar = new JButton("Aceptar");
        contenedor.setLayout(new FlowLayout());
        contenedor.add(proyectoLabel);
        contenedor.add(nombre);
        contenedor.add(aceptar);
        formulario.pack();

        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formulario.setVisible(true);


        aceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                añadirEtiqueta(titulo, nombre.getText());
            }
    });
    }

    public void añadirEtiqueta(JTextField titulo, String texto){
        controlador.añadirEtiqueta(titulo.getText(), texto);
    }

}
