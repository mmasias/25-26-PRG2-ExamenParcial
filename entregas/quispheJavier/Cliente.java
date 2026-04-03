package quispheJavier;

public class Cliente {
    public static void main(String[] args) {

        Producto laptopHP = new Producto("L001", "LaptopHP", 800, 15);

        Cliente carlosRuiz = new Cliente("Carlos Ruiz", "carlos@email.com", "Madrid");

        Pedido pedido1 = new Pedido("01/03/2025", 800, laptopHP, carlosRuiz);
        pedido1.estado = "Enviado";

        pedido1.mostrarPedido();
    }
}