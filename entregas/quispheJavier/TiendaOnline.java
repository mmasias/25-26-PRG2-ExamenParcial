
class TiendaOnline {
    class Producto {
    String codigo;
    String nombreProducto;
    int precio;
    int stock;

    public Producto(String codigo, String nombreProducto, int precio, int stock){
        assert codigo != null;
        assert nombreProducto != null;
        assert precio >= 0;
        assert stock >= 0;

        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto(Producto producto){
        this.codigo = producto.codigo;
        this.nombreProducto = producto.nombreProducto;
        this.precio = producto.precio;
        this.stock = producto.stock;
    }

    public Producto(){
        this.codigo = "";
        this.nombreProducto = "";
        this.precio = 0;
        this.stock = 0;
    }
}
    class Cliente {
    String nombreCliente;
    String email;
    String direccion;

    public Cliente(String nombreCliente, String email, String direccion){
        assert nombreCliente != null;
        assert email != null;
        assert direccion != null;

        this.nombreCliente = nombreCliente;
        this.email = email;
        this.direccion = direccion;
    }

    public Cliente(Cliente cliente){
        this.nombreCliente = cliente.nombreCliente;
        this.email = cliente.email;
        this.direccion = cliente.direccion;
    }

    public Cliente(){
        this.nombreCliente = "";
        this.email = "";
        this.direccion = "";
    }
}
    class Pedido {
    String fecha;
    int total;
    Producto producto;
    Cliente cliente;
    String estado;

    public Pedido(String fecha, int total, Producto producto, Cliente cliente){
        assert fecha != null;
        assert producto != null;
        assert cliente != null;
        assert total >= 0;

        this.fecha = fecha;
        this.total = total;
        this.producto = producto;
        this.cliente = cliente;
        this.estado = "Pendiente";
    }

    public Pedido(Pedido pedido){
        this.fecha = pedido.fecha;
        this.total = pedido.total;
        this.producto = pedido.producto;
        this.cliente = pedido.cliente;
        this.estado = pedido.estado;
    }

    public Pedido(){
        this.fecha = "";
        this.total = 0;
        this.producto = null;
        this.cliente = null;
        this.estado = "Pendiente";
    }

    public void clone(){
        Pedido copia = new Pedido(this);
        Console console = System.console();

        if (console != null) {
            console.writer().println("Pedido clonado");
        } else {
            System.out.println("Pedido clonado");
        }
    }

    private boolean esEstado(String valor){
        return estado.equals(valor);
    }

    public boolean fueEnviado(){
        assert estado != null;
        return esEstado("Enviado");
    }

    public boolean estaPendiente(){
        assert estado != null;
        return esEstado("Pendiente");
    }

    public boolean fueEntregado(){
        assert estado != null;
        return esEstado("Entregado");
    }

    public void mostrarPedido(){
        assert estado != null;

        Console console = System.console();

        if(console != null){
            console.writer().println("Fecha: " + fecha);
            console.writer().println("Total: " + total);

            if(producto != null){
                console.writer().println("Producto: " + producto.nombreProducto);
            }

            if(cliente != null){
                console.writer().println("Cliente: " + cliente.nombreCliente);
            }

            console.writer().println("Estado: " + estado);
            console.writer().println("-------------------------");
        } else {
            System.out.println("Fecha: " + fecha);
            System.out.println("Total: " + total);

            if(producto != null){
                System.out.println("Producto: " + producto.nombreProducto);
            }

            if(cliente != null){
                System.out.println("Cliente: " + cliente.nombreCliente);
            }

            System.out.println("Estado: " + estado);
            System.out.println("-------------------------");
        }
    }
}
}