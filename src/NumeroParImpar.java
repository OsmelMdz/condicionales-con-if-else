public class NumeroParImpar {
    public static String verificarNumero(int numero){
        if (numero % 2 == 0){
            return "El número " + numero + " es par.";
        } else {
            return "El número " + numero + " es impar.";
        }
    }
}
