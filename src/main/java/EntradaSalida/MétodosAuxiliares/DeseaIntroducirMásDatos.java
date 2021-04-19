package EntradaSalida.MétodosAuxiliares;

import java.util.Scanner;

public class DeseaIntroducirMásDatos {

    public static boolean deseaIntroducirMásDatos(String tipoDato, Scanner sc){

        String entrada = sc.next();
        System.out.print("DESEA INTRODUCIR MÁS "+tipoDato+"? (s/n)--->");
        System.out.println("");

        return !"n".equals(entrada);
    }
}
