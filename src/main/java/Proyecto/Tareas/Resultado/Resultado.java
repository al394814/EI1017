package Proyecto.Tareas.Resultado;

public class Resultado {

    String identificador;
    int horasInvertidas;
    boolean tipoResultado; //true-->resultado es interno || false--> destinado comercialización

    public Resultado() {
    }

    public Resultado(String identificador, int horasInvertidas, boolean tipoResultado){

        this.identificador=identificador;
        this.horasInvertidas= horasInvertidas;
        this.tipoResultado = tipoResultado;

    }
    public String getIdentificador() {
        return identificador;
    }
    public int getHorasInvertidas() {
        return horasInvertidas;
    }
    public boolean getTipoResultado() {
        return tipoResultado;
    }

}
