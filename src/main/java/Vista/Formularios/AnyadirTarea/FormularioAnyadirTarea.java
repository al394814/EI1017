package Vista.Formularios.AnyadirTarea;

import Controlador.Controlador;
import Modelo.Excepciones.DarDeAltaPersonaException;
import Vista.Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioAnyadirTarea {

    private Controlador controlador;

    private JTextField titulo = new JTextField(20);
    private JTextField descripcion = new JTextField(20);
    private  JTextField prioridad = new JTextField(20);
    private  JTextField identificador = new JTextField(20);
    private  JTextField horasInvertidas = new JTextField(20);
    private  JTextField Resultado = new JTextField(20);
    private JTextField costeFacturación = new JTextField(20);


    private JFrame formulario;
    private JButton banyadirTareas = new JButton("AÑADIR TAREAS");
    private ButtonGroup personasTarea = new ButtonGroup();
    public FormularioAnyadirTarea(Controlador controlador){
        this.controlador = controlador;
        formulario = new JFrame("Añadir Cliente");
        formulario.setLayout(new GridLayout(10, 2));
        Container contenedor = formulario.getContentPane();


        JPanel panel = new JPanel();


        contenedor.add(new JLabel("Titulo:"));
        contenedor.add(titulo);

        contenedor.add(new JLabel("Descripcion:"));
        contenedor.add(descripcion);
        contenedor.add(new JLabel("Prioridad:"));
        contenedor.add(prioridad);
        contenedor.add(new JLabel("Coste de Facturación:"));
        contenedor.add(costeFacturación);
        contenedor.add(new JLabel("Horas Invertidas:"));
        contenedor.add(horasInvertidas);
        contenedor.add(new JLabel("Identificador:"));
        contenedor.add(identificador);
        contenedor.add(new JLabel("Tipo Resultado:"));
        contenedor.add(Resultado);



        contenedor.add(panel);

        contenedor.add(banyadirTareas);
        formulario.pack();
        formulario.setVisible(true);
        limpiarCampos();


       /* banyadirTareas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    insetarTarea();
                } catch (DarDeAltaPersonaException darDeAltaPersonaException) {
                    darDeAltaPersonaException.printStackTrace();
                }
            }
        });*/


    }

    /*public void insetarTarea() {
        controlador.insertarTarea();

    }*/


    public void limpiarCampos() {
        titulo.setText("");
        descripcion.setText("");
        prioridad.setText("");
        identificador.setText("");
        horasInvertidas.setText("");
        Resultado.setText("");
        costeFacturación.setText("");
    }


}
