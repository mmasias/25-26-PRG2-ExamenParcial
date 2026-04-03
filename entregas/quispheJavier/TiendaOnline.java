
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
}