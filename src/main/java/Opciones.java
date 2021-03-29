public class Opciones {

    public enum OpcionesDelMenú{

        INICIAR_NUEVO_PROYECTO("INTRODUCE UN NUEVO PROYECTO"),
        DAR_DE_ALTA_PERSONAS("DAR DE ALTA PERSONAS"),
        DAR_DE_ALTA_TAREAS("DAR DE ALTA TAREAS"),
        ASIGNAR_TAREAS_RESPONSABLE_PERSONA("ASIGNAR TAREAS BAJO LA RESPONSABILIDAD DE UNA PERSONA"),
        //debería introducir una opción que sea asignar_personas_tareas(el enunciado no lo pide pero para la lógica utilizada en el programa creo que viene bien)
        ELIMINAR_PERSONA_TAREA("ELIMINAR PERSONA DE UNA TAREA"),
        INTRODUCIR_PERSONA_TAREA("INTRODUCIR PERSONA A UNA TAREA"),
        LISTAR_PERSONAS_PROYECTO("LISTAR LAS PERSONAS DEL PROYECTO"),
        LISTAR_TAREAS_PROYECTO("LISTAR LAS TAREAS DEL PROYECTO");

        private String descripción;

        OpcionesDelMenú(String descripción){
            this.descripción=descripción;
        }

        public String getDescripción() {
            return descripción;
        }

        public static OpcionesDelMenú getOpcion(int posicion) {
            return values()[posicion];
        }

        public static String getMenú() {
            StringBuilder sb = new StringBuilder();
            for (OpcionesDelMenú opcion : OpcionesDelMenú.values()) {
                sb.append(opcion.ordinal() + 1);
                sb.append(".- ");
                sb.append(opcion.getDescripción());
                sb.append("\n");
            }
            return sb.toString();
        }
    }

}