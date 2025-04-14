public class AccesoSistema {
    private final int codigoCorrecto = 2023;
    private final int nivelPermisoMinimo = 1;
    private final int nivelPermisoMaximo = 3;

    public String verificarAcceso(int codigoDigitado, int nivelPermiso) {
        boolean codigoValido = codigoDigitado == codigoCorrecto;
        boolean permisoValido = nivelPermiso >= nivelPermisoMinimo && nivelPermiso <= nivelPermisoMaximo;

        if (codigoValido && permisoValido) {
            return "Acceso permitido. ¡Bienvenido al sistema!";
        }

        int motivos = 0;
        if (!codigoValido) motivos++;
        if (!permisoValido) motivos++;

        StringBuilder resultado = new StringBuilder("Acceso denegado.\n");
        resultado.append(motivos > 1 ? "Motivos:\n" : "Motivo:\n");

        if (!codigoValido) {
            resultado.append("- Código de acceso incorrecto.\n");
        }
        if (!permisoValido) {
            resultado.append("- Nivel de permiso inválido.\n");
        }

        return resultado.toString();
    }
}
