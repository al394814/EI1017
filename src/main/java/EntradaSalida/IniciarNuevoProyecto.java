package EntradaSalida;

import java.util.Scanner;

import static Proyecto.Proyecto.creadorProyecto;

public class IniciarNuevoProyecto {

    public void iniciarNuevoProyecto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del proyecto: ");
        String nombreProyecto = sc.next();
        creadorProyecto(nombreProyecto);
    }
}
