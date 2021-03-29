package EntradaSalida.MétodosAuxiliares;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static EntradaSalida.MétodosAuxiliares.DeseaIntroducirMásDatos.deseaIntroducirMásDatos;

public class PedirAlUsuarioListaDeEtiquetasDeUnaTarea {

    public static LinkedList<String> PedirAlUsuarioListaDeEtiquetasDeUnaTarea(Scanner sc){
        System.out.print("\nAÑADE TODAS LAS ETIQUETAS QUE CARACTERIZEN ESTA TAREA ");
        LinkedList<String> listaEtiquetas = new LinkedList<String>();
        boolean quedanEtiquetasPorIntroducir = true;
        int contador=1;

        while(quedanEtiquetasPorIntroducir){

            System.out.print("\nINTRODUZCA LA "+contador+" ETIQUETA DE LA TAREA ---> ");
            contador++;
            String etiqueta = sc.next();
            listaEtiquetas.add(etiqueta);

            quedanEtiquetasPorIntroducir=deseaIntroducirMásDatos(new String("ETIQUETAS"),sc);
        }

        return listaEtiquetas;
    }

}
