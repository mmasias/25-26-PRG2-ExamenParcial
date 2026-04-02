public class Pedido {
    private Cliente cliente;
    private Producto producto;
    private Fecha fecha;
    private String estado;

    public Pedido(Cliente cliente, Producto producto, Fecha fecha, String estado) {
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.estado = estado;
    }

    public String pedidoRealizado() {
        return "Pedido de " + producto.mostrarProducto() + " para " + cliente.mostrarCliente();
    }

    public void quitarStock() {
        if (producto.hayStock()) {
            producto.stockActualizado(-1);
        }
    }

    public String fechaPedido() {
        return "Fecha: " + fecha.mostrarFecha();
    }

    public String verEstado() {
        return "Estado: " + estado;
    }
}