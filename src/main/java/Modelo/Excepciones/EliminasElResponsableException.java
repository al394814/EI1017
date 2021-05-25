package Modelo.Excepciones;

public class EliminasElResponsableException extends Exception {
    public EliminasElResponsableException(){
        super("NO PUEDES ELIMINAR EL RESPONSABLE DE LA TAREA");
    }
}
