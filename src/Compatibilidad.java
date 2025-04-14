public class Compatibilidad {
    public String verificarCompatibilidad(int edad, double peso) {
        boolean edadValida = edad >= 18 && edad <= 65;
        boolean pesoValido = peso > 50;

        if (edadValida && pesoValido) {
            return "El donante es compatible para donar sangre.";
        }

        int motivos = 0;
        if (!edadValida) motivos++;
        if (!pesoValido) motivos++;

        StringBuilder resultado = new StringBuilder("El donante no es compatible.\n");

        resultado.append(motivos > 1 ? "Motivos:\n" : "Motivo:\n");

        if (!edadValida) {
            resultado.append("- Debe tener entre 18 y 65 años.\n");
        }
        if (!pesoValido) {
            resultado.append("- Debe pesar más de 50 kg.\n");
        }

        return resultado.toString();
    }
}
