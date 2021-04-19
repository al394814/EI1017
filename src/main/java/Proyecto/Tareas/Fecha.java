package Proyecto.Tareas;

import java.io.Serializable;

public class Fecha implements Serializable {

    String fechaCreación;
    String fechaFinalización;
    boolean finalizado; //true--> acabado || false--> sin acabar

    public Fecha(){}

    public Fecha(String fechaCreación,String fechaFinalización, boolean finalizado){
        this.fechaCreación=fechaCreación;
        this.fechaFinalización=fechaFinalización;
        this.finalizado=finalizado;
    }

    public boolean getFinalizado() {
        return finalizado;
    }

    public String getFechaFinalización() {
        return fechaFinalización;
    }

    public String getFechaCreación() {
        return fechaCreación;
    }

    public static Fecha crearFecha(String fechaCreación,String fechaFinalización, boolean finalizado){

        return new Fecha(fechaCreación,fechaFinalización,finalizado);

    }


    public boolean isFinalizado() {
        return finalizado;
    }

    public String imprimirEstadoTarea() {

        String estadoTarea;
        if (finalizado)
            estadoTarea="Finalizada";
        else estadoTarea="Sin Finalizar";

        return  estadoTarea;
    }

    public void Finalizar(){
        finalizado = true;
    }
}
