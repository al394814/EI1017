package EntradaSalida.Excepciones;

public class TareaNoSeEncuentraEnProyectoException extends Exception {

    public TareaNoSeEncuentraEnProyectoException(){
        super("ESTA TAREA NO SE ENCUENTRA EN LAS TAREAS DEL PROYECTO\n");
    }

}
