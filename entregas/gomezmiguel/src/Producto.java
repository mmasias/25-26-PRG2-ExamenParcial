public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    private String codigo;

    public Producto(String nombre, double precio, int stock, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.codigo = codigo;
    }

    public String mostrarProducto() {
        return nombre + " - " + precio + "€";
    }

    public String verStock() {
        return "Stock actual: " + stock;
    }
    public String stockActualizado(int cantidad) {
        this.stock += cantidad;
        return "Nuevo stock: " + stock;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean hayStock() {
        return stock > 0;
    }
}

    