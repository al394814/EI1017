package Modelo.Excepciones;

public class PersonaNoSeEncuentraEnListaPersonasTarea extends Exception {

    public PersonaNoSeEncuentraEnListaPersonasTarea(){
        super("LA PERSONA NO SE ENCUENTRA EN LA LISTA DE PERSONAS ASIGNADAS A LA TAREA");
    }
}
