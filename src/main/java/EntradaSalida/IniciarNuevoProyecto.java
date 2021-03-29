package EntradaSalida;

import Proyecto.Proyecto;

import java.util.Scanner;

import static Proyecto.Proyecto.creadorProyecto;

public class IniciarNuevoProyecto {

    public static Proyecto iniciarNuevoProyecto(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del proyecto: ");
        String nombreProyecto = sc.next();
        System.out.print("\nLA TAREA HA FINALIZADO CON ÉXITO.\n\n");

        return creadorProyecto(nombreProyecto);
    }
}
