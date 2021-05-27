package Vista.Formularios;

import Controlador.Controlador;
import Modelo.Excepciones.EliminasElResponsableException;
import Modelo.Excepciones.PersonaNoSeEncuentraEnListaPersonasTarea;
import Vista.Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioEliminarPersonaTarea {

    Controlador controlador;
    private JFrame formulario;
    public FormularioEliminarPersonaTarea(Controlador controlador, JTextField titulo){
        this.controlador= controlador;
        formulario = new JFrame("Borrar Persona de Tarea");
        formulario.setLayout(new GridLayout(10, 2));
        Container contenedor = formulario.getContentPane();
        JTextField dni = new JTextField(20);
        JLabel proyectoLabel = new JLabel("INTRODUCE EL DNI DE LA PERSONA: ");
        JButton aceptar = new JButton("Aceptar");
        contenedor.setLayout(new FlowLayout());
        contenedor.add(proyectoLabel);
        contenedor.add(dni);
        contenedor.add(aceptar);
        formulario.pack();

        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formulario.setVisible(true);


        aceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    BorrarPersona(titulo, dni.getText());
                } catch (EliminasElResponsableException eliminasElResponsableException) {
                    eliminasElResponsableException.printStackTrace();
                } catch (PersonaNoSeEncuentraEnListaPersonasTarea personaNoSeEncuentraEnListaPersonasTarea) {
                    personaNoSeEncuentraEnListaPersonasTarea.printStackTrace();
                }
            }
        });
    }

    public void BorrarPersona(JTextField titulo, String texto) throws EliminasElResponsableException, PersonaNoSeEncuentraEnListaPersonasTarea {
        controlador.BorrarPersona(titulo.getText(), texto);
    }

}


