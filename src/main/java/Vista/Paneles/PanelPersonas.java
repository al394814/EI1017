package Vista.Paneles;

import Controlador.Controlador;
import Modelo.Modelo;
import Modelo.Proyecto.Personas.Persona;
import Vista.Formularios.AnyadirPersona.FormularioAnyadirPersona;
import Vista.Formularios.AnyadirTarea.FormularioAnyadirPersonas;
import Vista.Formularios.FormularioBuscarPersona;
import Vista.Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class PanelPersonas extends JPanel {
    private Controlador controlador;
    private Modelo modelo;
    private JTextArea areaDatosPersona = new JTextArea(20, 10);
    private JTextField dniPersona;
    private JFrame vista;

    public PanelPersonas(Controlador controlador, Modelo modelo, JFrame vista) {


        this.controlador = controlador;
        this.modelo = modelo;
        this.vista = vista;
        JButton bBuscarPersona = new JButton("Buscar Persona");

        JButton bInsetarPersona = new JButton("Añadir Persona");

        JButton bListarPersonasSinTarea = new JButton("Listar Persona sin Tarea");

        JLabel jDNI = new JLabel("DNI del cliente: ");
        dniPersona = new JTextField(10);

        //String datos = modelo.informacionClientes(modelo.getClientes());

        JScrollPane panel = new JScrollPane(areaDatosPersona);
        panel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        panel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //rellenarInformacion(datos);


      bBuscarPersona.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                buscarPersona(dniPersona.getText());
            }
        });

        bInsetarPersona.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                new FormularioAnyadirPersonas(controlador);
            }
        });



       /*+bListarPersonasSinTarea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new FormularioListarPersonasSinTarea(controlador);

            }
        });*/

        JPanel panelDNI = new JPanel();
        panelDNI.add(jDNI);
        panelDNI.add(dniPersona);

        Container contenedor = new Container();
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.PAGE_AXIS));
        JPanel panelOption = new JPanel();

        panelOption.add(panelDNI);
        panelOption.add(bBuscarPersona);
        panelOption.add(bInsetarPersona);
        panelOption.add(bListarPersonasSinTarea);

        contenedor.add(panelOption);
        contenedor.add(panel);
        add(contenedor);

        areaDatosPersona.setForeground(Color.BLACK);
        areaDatosPersona.setEditable(false);

    }
      /*  public void buscarPersona() {
        if (!dniIsEmpty()){
            if controlador.
        }

        }*/


    public boolean dniIsEmpty() {
        return (dniPersona.getText().length() <= 0);
}



    public void buscarPersona(String dni){
        Persona persona = controlador.buscarPersona(dni);
        new FormularioBuscarPersona(controlador, persona);

    }




}