package Modelo.Excepciones;

public class NoIntroduzcaDosVecesLaMismaPersonaException extends Exception{
    public NoIntroduzcaDosVecesLaMismaPersonaException(){
        super("ESTA PERSONA YA LA HAS INTRODUCIDO ANTES EN LAS PERSONAS QUE TIENE ASIGNADA UNA TAREA\n");
    }
}
