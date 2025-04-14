public class Intervalo {
    public String verificarIntervalo(int valor) {
        if (valor >= 1000 && valor <= 5000) {
            return "El valor " + valor + " está dentro del intervalo permitido para el préstamo.";
        } else {
            return "El valor " + valor + " no está dentro del intervalo permitido para el préstamo.";
        }
    }
}
