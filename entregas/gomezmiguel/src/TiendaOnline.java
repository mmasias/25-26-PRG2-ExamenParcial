public class TiendaOnline {
    private Producto producto;
    private Cliente cliente;
    private Pedido pedido;
    private Fecha fecha;

    public TiendaOnline(Producto producto, Cliente cliente, Pedido pedido, Fecha fecha) {
        this.productoEnVenta = producto;
        this.clienteActual = cliente;
        this.pedidoRealizado = pedido;
        this.fechaDeOperacion = fecha;
    }
    public String comprar() {
        pedidoRealizado.quitarStock();
        return "Procesado: La compra se ha completado correctamente.";
    }

    public String verProductos() {
        return "Catálogo: " + productoEnVenta.mostrarProducto();
    }

    public String realizarPedido() {
        return pedidoRealizado.pedidoRealizado() + " [" + pedidoRealizado.verEstado() + "]";
    }
    public static void main(String[] args) {
        Producto laptopHP = new Producto("Laptop HP", 800.0, 10, "L001");
        Cliente carlosRuiz = new Cliente("Carlos Ruiz", "carlos@email.com", "Madrid");
        Fecha fechaDeHoy = new Fecha(1, 3, 2026);
        
        Pedido primerPedido = new Pedido(carlosRuiz, laptopHP, fechaDeHoy, "Enviado");

        TiendaOnline techStore = new TiendaOnline(laptopHP, carlosRuiz, primerPedido, fechaDeHoy);

        System.out.println(techStore.verProductos());
        System.out.println(techStore.realizarPedido());
        System.out.println(techStore.comprar());
        System.out.println(laptopHP.verStock());
    }
}