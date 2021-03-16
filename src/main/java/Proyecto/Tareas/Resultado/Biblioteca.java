package Proyecto.Tareas.Resultado;

public class Biblioteca extends Resultado {

    String lenguajeProgramaciónUsado;
    int líneasCódigo;
    int númeroMódulo;

    public Biblioteca(){
        super();
    }
    public Biblioteca(String identificador,int horasInvertidas,boolean tipoResultado,String lenguajeProgramaciónUsado, int líneasCódigo, int númeroMódulo){
        super(identificador,horasInvertidas,tipoResultado);
        this.lenguajeProgramaciónUsado=lenguajeProgramaciónUsado;
        this.líneasCódigo=líneasCódigo;
        this.númeroMódulo=númeroMódulo;
    }

    public int getLíneasCódigo() {
        return líneasCódigo;
    }

    public String getLenguajeProgramaciónUsado() {
        return lenguajeProgramaciónUsado;
    }

    public int getNúmeroMódulo() {
        return númeroMódulo;
    }

    public String toString(){
        return "lenguaje de programación usado: " + lenguajeProgramaciónUsado + "\nlíneas código: " + líneasCódigo + "\nnúmero de módulos: " + "\nhoras invetidas: " + horasInvertidas;
    }

}
