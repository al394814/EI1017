package EntradaSalida.MétodosAuxiliares;

import java.util.Scanner;

public class DeseaIntroducirMásDatos {

    public static boolean deseaIntroducirMásDatos(String tipoDato, Scanner sc){

        System.out.println("\nDESEA INTRODUCIR MÁS "+tipoDato+"? (SI/NO)--->");
        String entrada = sc.next();
        if (entrada=="NO")
            return false;
    return true;
    }
}
