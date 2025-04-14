public class Descuento {
    public String aplicarDescuento(double valorCompra) {
        if (valorCompra >= 100.0) {
            double descuento = valorCompra * 0.10;
            double valorConDescuento = valorCompra - descuento;
            return String.format("Descuento del 10%% aplicado.\nNuevo valor: $%.2f", valorConDescuento);
        } else {
            return String.format("Descuento no aplicado.\nValor total: $%.2f", valorCompra);
        }
    }
}
