public class Cliente {
    private String nombre;
    private String email;
    private String direccion;

    public Cliente(String nombre, String email, String direccion) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }

    public String mostrarCliente() {
        return "Cliente: " + nombre + " | Email: " + email;
    }

    public String pedidosRealizados() {
        return "Historial de pedidos de " + nombre;
    }
}