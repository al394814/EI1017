package Modelo.Proyecto.Tareas;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Fecha implements Serializable {

    String fechaCreación;
    String fechaFinalización;
    boolean finalizado; //true--> acabado || false--> sin acabar

    public Fecha(){}

    public Fecha(String fechaCreación, boolean finalizado){
        this.fechaCreación= fechaCreación;
        this.fechaFinalización= null;
        this.finalizado=finalizado;
    }

    public Fecha(String fechaCreación, String fechaFinalización, boolean finalizado){
        this.fechaCreación= fechaCreación;
        this.fechaFinalización= null;
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

    public static Fecha crearFecha(String fechaCreación, boolean finalizado){

        return new Fecha(fechaCreación, finalizado);

    }
    public void setFechaCreación(String fecha){
        this.fechaCreación = fecha;
    }

    public void setFechaFinalización(String fecha){
        fechaFinalización = fecha;
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
