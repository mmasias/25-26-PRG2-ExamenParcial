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