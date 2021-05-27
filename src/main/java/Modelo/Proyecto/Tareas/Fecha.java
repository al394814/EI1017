package Modelo.Proyecto.Tareas;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Fecha implements Serializable {

    LocalDateTime fechaCreación;
    LocalDateTime fechaFinalización;
    boolean finalizado; //true--> acabado || false--> sin acabar

    public Fecha(){}

    public Fecha(boolean finalizado){
        this.fechaCreación=LocalDateTime.now();
        this.fechaFinalización= null;
        this.finalizado=finalizado;
    }

    public boolean getFinalizado() {
        return finalizado;
    }

    public LocalDateTime getFechaFinalización() {
        return fechaFinalización;
    }

    public LocalDateTime getFechaCreación() {
        return fechaCreación;
    }

    public static Fecha crearFecha(boolean finalizado){

        return new Fecha(finalizado);

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
