package Vista.Paneles;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class PanelTareas extends JPanel {
    private Controlador controlador;
    private Modelo modelo;
    private JTextArea areaDatosTarea = new JTextArea(20, 10);
    private JTextField dniTarea;
    private JFrame vista;

    public PanelTareas(Controlador controlador, Modelo modelo, JFrame vista) {


        this.controlador = controlador;
        this.modelo = modelo;
        this.vista = vista;
        JButton bBuscarTarea = new JButton("Buscar Tarea");

        JButton bInsetarTarea = new JButton("Añadir Tarea");
        JButton bBorrarTarea = new JButton("Borrar Tarea ");
        JButton bfinalizarTarea = new JButton("Finalizar");

        JButton bListarTareaSinPersona = new JButton("Listar Tareas Sin Personas");

        JLabel jDNI = new JLabel("Nombre de la tarea: ");
        dniTarea = new JTextField(10);

        //String datos = modelo.informacionClientes(modelo.getClientes());

        JScrollPane panel = new JScrollPane(areaDatosTarea);
        panel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        panel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //rellenarInformacion(datos);


      /*  bBuscarPersona.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                buscarPersona();
            }
        })*/

        /*bInsetarPersona.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                new FormularioCrearPersona(controlador);
            }
        });*/

        bBorrarTarea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                borrarTarea();
            }

        });

        bfinalizarTarea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                finalizarTarea();
            }
        });
       /* bListarPersonasSinTarea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new FormularioListarPersonasSinTarea(controlador);

            }
        });*/

        JPanel panelDNI = new JPanel();
        panelDNI.add(jDNI);
        panelDNI.add(dniTarea);

        Container contenedor = new Container();
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.PAGE_AXIS));
        JPanel panelOption = new JPanel();

        panelOption.add(panelDNI);
        panelOption.add(bBuscarTarea);
        panelOption.add(bInsetarTarea);
        panelOption.add(bBorrarTarea);
        panelOption.add(bfinalizarTarea);
        panelOption.add(bListarTareaSinPersona);

        contenedor.add(panelOption);
        contenedor.add(panel);
        add(contenedor);

        areaDatosTarea.setForeground(Color.BLACK);
        areaDatosTarea.setEditable(false);

    }
      /*  public void buscarPersona() {
        if (!dniIsEmpty()){
            if controlador.
        }

        }*/


    public boolean dniIsEmpty() {
        return (dniTarea.getText().length() <= 0);
    }
    public void borrarTarea()  {

    }
    public void finalizarTarea(){}




}