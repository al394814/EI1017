package EntradaSalida.Excepciones;

public class PersonaResponsableNoEstaEnListaException extends Exception {
    public PersonaResponsableNoEstaEnListaException(){
        super("RECUERDA QUE LA PERSONA RESPONSABLE TIENE QUE ESTAR EN LA LISTA DE PERSONAS ASIGNADAS A LA TAREA\n");
    }
}
