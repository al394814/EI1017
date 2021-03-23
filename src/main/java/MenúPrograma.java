import java.util.Scanner;

import static Proyecto.Proyecto.*;


public class MenúPrograma {

    public void leeProyecto(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del proyecto: ");
        String nombreProyecto = sc.next();
        creadorProyecto(nombreProyecto);
    }

}
