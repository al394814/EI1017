package Vista.Formularios.AnyadirPersona;

import Controlador.Controlador;
import Modelo.Proyecto.Proyecto;
import Vista.TratamientoErrores;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioAnyadirPersona {

    private JTextField nombre = new JTextField(20);
    private JTextField dni = new JTextField(20);
    private JTextField correo = new JTextField(20);
    private JButton bAñadir = new JButton("AÑADIR");
    private JFrame formulario;
    private Controlador controlador;
    private Proyecto proyecto;

    public FormularioAnyadirPersona(final Controlador controlador, final Proyecto proyecto){
        this.controlador=controlador;
        this.proyecto=proyecto;
        formulario = new JFrame("AÑADIR CLIENTES");
        Image icono = Toolkit.getDefaultToolkit().getImage("src/imagenes/add-user.png");
        formulario.setIconImage(icono);
        Container contenedor = formulario.getContentPane();

        formulario.setLayout(new GridLayout(5, 2));

        contenedor.add(new JLabel("NOMBRE"));
        contenedor.add(nombre);
        contenedor.add(new JLabel("DNI"));
        contenedor.add(dni);
        contenedor.add(new JLabel("CORREO ELÉCTRONICO"));
        contenedor.add(correo);
        contenedor.add(bAñadir);


        formulario.pack();
        formulario.setVisible(true);
        limpiarCampos();

        bAñadir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                anyadirCliente();
            }
        });

    }

    private void limpiarCampos(){
        nombre.setText("");
        dni.setText("");
        correo.setText("");
    }

    private void anyadirCliente(){
        if (nombre.getText().length()>0 && dni.getText().length()>0 && correo.getText().length()>0){

        }
        else
            new TratamientoErrores("COMPLETA TODOS LOS CAMPOS",formulario,true);

    }
}
