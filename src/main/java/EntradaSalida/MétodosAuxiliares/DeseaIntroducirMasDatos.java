package EntradaSalida.MétodosAuxiliares;

import EntradaSalida.Excepciones.PedimosUnosDatosSeIntroducenOtrosException;

import java.util.Scanner;

public class DeseaIntroducirMasDatos {

    public static boolean deseaIntroducirMásDatos(String tipoDato, Scanner sc){

        try{
            System.out.print("DESEA INTRODUCIR MÁS "+tipoDato+"? (s/n)--->");
            String entrada = sc.nextLine();
            if ("n".equals(entrada) || "s".equals(entrada)){
                return !"n".equals(entrada);
            }
            else throw new PedimosUnosDatosSeIntroducenOtrosException();
        }
        catch (PedimosUnosDatosSeIntroducenOtrosException e){
            System.out.println(e.getMessage());
            System.out.print("INTRODUCE DE NUEVO LOS DATOS (s/n) --->");
            String esperamosEntradaCorrecta=sc.nextLine();
            while (!("n".equals(esperamosEntradaCorrecta) || "s".equals(esperamosEntradaCorrecta))){
                System.out.println(e.getMessage());
                System.out.print("INTRODUCE DE NUEVO LOS DATOS (s/n) --->");
                esperamosEntradaCorrecta=sc.nextLine();
            }
            return !"n".equals(esperamosEntradaCorrecta);
        }
    }
}
