public class Contrasena {
    String contrasenaCorrecta = "123456";

    public void validar(String intento) {
        if (intento.equals(contrasenaCorrecta)) {
            System.out.println("¡Acceso permitido!");
        } else {
            System.out.println("¡Acceso denegado!");
        }
    }
}
