package EntradaSalida.Excepciones;

public class PersonaNoSeEncuentraEnProyectoException extends Exception {

    public PersonaNoSeEncuentraEnProyectoException(){
        super("NO HEMOS ENCONTRADO UNA PERSONA CON ESTE DNI EN EL PROYECTO\n");
    }
}
