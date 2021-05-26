package Vista;

import javax.swing.*;
import java.awt.*;

public class TratamientoErrores {

        private String info;

        public TratamientoErrores(String info) {

            JFrame formulario2 = new JFrame("Error");
            Container contenedor2 = formulario2.getContentPane();
            contenedor2.add(new JLabel(info));
            formulario2.pack();
            formulario2.setVisible(true);
            }
}

