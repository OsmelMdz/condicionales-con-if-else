public class Asignatura {
    public static String verificarCalificacion(double calificaion){
        if (calificaion >= 7.0) {
            return "El estudiante tuvo un promedio de " + calificaion + " y fue aprobado.";
        } else if (calificaion >= 5.0) {
            return "El estudiante tuvo un promedio de " + calificaion + " y está en recuperación.";
        } else {
            return "El estudiante tuvo un promedio de " + calificaion + " y fue reprobado.";
        }
    }
}
