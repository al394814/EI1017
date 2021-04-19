import EntradaSalida.IniciarNuevoProyecto;

import java.io.IOException;

import static Interfaz.MenuPrograma.MenúPrograma;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("\nVAS A INICIAR UN PROYECTO\n");
        MenúPrograma(IniciarNuevoProyecto.iniciarNuevoProyecto());
    }
}
