package EntradaSalida.MétodosAuxiliares;

import java.util.Scanner;

public class DeseaIntroducirMásDatos {

    public static boolean deseaIntroducirMásDatos(String tipoDato, Scanner sc){

        System.out.print("\nDESEA INTRODUCIR MÁS "+tipoDato+"? (SI/NO)--->");
        String entrada = sc.next();
        if ("NO".equals(entrada))
            return false;
    return true;
    }
}
