package Proyecto.Tareas.Resultado;

public class PáginaWeb extends Resultado {

    boolean tipo; //True --> estática || false--> dinámica
    String lenguaje;
    String tipoBackend;

    public PáginaWeb(boolean tipo,String lenguaje,String tipoBackend) {
        this.tipo = tipo;
        this.lenguaje = lenguaje;
        this.tipoBackend=tipoBackend;
    }

    public boolean isTipo() {
        return tipo;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public String getTipoBackend() {
        return tipoBackend;
    }

}
