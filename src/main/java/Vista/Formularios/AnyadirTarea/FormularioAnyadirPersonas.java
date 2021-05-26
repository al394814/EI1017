package Vista.Formularios.AnyadirTarea;

import Controlador.Controlador;
import Modelo.Excepciones.DarDeAltaPersonaException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class FormularioAnyadirPersonas {


    private JTextField nombre = new JTextField(20);
    private JTextField dni = new JTextField(20);

    private JTextField correo = new JTextField(20);

    private JButton bInsetar = new JButton("Añadir");

    private JFrame formulario;
    private Controlador controlador;

    public FormularioAnyadirPersonas(Controlador controlador) {
        this.controlador = controlador;
        formulario = new JFrame("Añadir Cliente");//Creamos el JFrame

        formulario.setLayout(new GridLayout(10, 2));
        Container contenedor = formulario.getContentPane();


        JPanel panel = new JPanel();


        contenedor.add(new JLabel("Nombre:"));
        contenedor.add(nombre);

        contenedor.add(new JLabel("DNI:"));
        contenedor.add(dni);
        contenedor.add(new JLabel("Correo:"));
        contenedor.add(correo);


        contenedor.add(panel);

        contenedor.add(bInsetar);
        formulario.pack();
        formulario.setVisible(true);
        limpiarCampos();


        bInsetar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    insetarCliente();
                } catch (DarDeAltaPersonaException darDeAltaPersonaException) {
                    darDeAltaPersonaException.printStackTrace();
                }
            }
        });


    }

    public void limpiarCampos() {
        nombre.setText("");
        dni.setText("");
        correo.setText("");
    }

    public void insetarCliente() throws DarDeAltaPersonaException {
        if (nombre.getText().length() > 0 && dni.getText().length() > 0 && correo.getText().length() > 0) {
            System.out.print("Añadiendo");
            controlador.insertarPersona(nombre.getText(), dni.getText(), correo.getText());
        }
    }
}