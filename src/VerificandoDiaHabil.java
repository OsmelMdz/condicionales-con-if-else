public class VerificandoDiaHabil {
    public String verificarDia(String dia) {
        if (dia.equals("lunes") || dia.equals("martes") ||
                dia.equals("miércoles") || dia.equals("jueves") ||
                dia.equals("viernes")) {
            return dia + " es un día hábil.";
        } else {
            return dia + " no es un día hábil.";
        }
    }
}
