package Proyecto.Tareas;

public class Fecha {

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
}
