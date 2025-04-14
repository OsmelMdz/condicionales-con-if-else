public class Triangulo {
    public String verificarTriangulo(int lado1, int lado2, int lado3) {
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            return "Los lados pueden formar un triángulo.";
        } else {
            return "Los lados no pueden formar un triángulo.";
        }
    }
}
