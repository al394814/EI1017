package Modelo.Excepciones;

public class DarDeAltaTareasException extends Exception {

    public DarDeAltaTareasException(){
        super("LA TAREA YA SE ENCUENTRA DENTRO DEL PROYECTO");
    }

}
