package Modelo.Excepciones;

public class DarDeAltaPersonaException extends Exception {

    public DarDeAltaPersonaException(){
        super("LA PERSONA YA SE ENCUENTRA DENTRO DEL PROYECTO");
    }

}
