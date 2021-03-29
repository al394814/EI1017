import java.util.Scanner;


public class MenúPrograma {

    public void MenúPrograma(){

        System.out.println(Opciones.OpcionesDelMenú.getMenú());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elija una opción: ");
        int opcion = scanner.nextInt() - 1;
        Opciones.OpcionesDelMenú opcionMenú = Opciones.OpcionesDelMenú.getOpcion(opcion);
        System.out.println("Ha elegido: " + opcionMenú);

        switch (opcion){



        }

    }

}
