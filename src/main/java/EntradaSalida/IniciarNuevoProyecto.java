package EntradaSalida;

import Proyecto.Proyecto;

import java.io.IOException;
import java.util.Scanner;

import static Proyecto.Proyecto.creadorProyecto;

public class IniciarNuevoProyecto  {

    public static Proyecto iniciarNuevoProyecto(){
        Scanner sc = new Scanner(System.in);
        System.out.print("INTRODUCE EL NOMBRE DEL PROYECTO: ");
        String nombreProyecto = sc.nextLine();
        System.out.print("\nLA TAREA HA FINALIZADO CON ÉXITO.\n\n");

        return creadorProyecto(nombreProyecto);
    }
}
