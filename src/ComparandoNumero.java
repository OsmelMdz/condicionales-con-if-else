public class ComparandoNumero {
    public String comparar(int num1, int num2) {
        if (num1 > num2) {
            return "El número mayor es " + num1 + ".";
        } else if (num2 > num1) {
            return "El número mayor es " + num2 + ".";
        } else {
            return "Los números son iguales.";
        }
    }
}
