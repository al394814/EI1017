package Proyecto.Tareas.Resultado;

import java.io.Serializable;

public class Documentación implements Serializable {
    private String campo;
    private int numpaginas;
    private int espaciodisc;

    public Documentación(){}


    public Documentación(String campo, int numpaginas, int espaciodisc) {
        this.campo = campo;
        this.numpaginas = numpaginas;
        this.espaciodisc = espaciodisc;
    }

    public String getCampo(){ return campo; }
    public int getNumpaginas(){ return numpaginas; }
    public int getEspaciodisc(){ return espaciodisc; }

    public String toString(){
        return "El campo utilizado es: "+ campo +"\nEl número de págians es:"+numpaginas+"\nEl espacio en el disco es:"+espaciodisc;
    }
}
