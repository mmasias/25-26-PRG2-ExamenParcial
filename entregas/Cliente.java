public class Cliente {
    private String Nombre;
    private String DNI;
    private String Direccion;

    public Cliente(String nombre, String dni, String direccion) {
        this.Nombre = nombre;
        this.DNI = dni;
        this.Direccion = direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDni() {
        return DNI;
    }

    public String getDireccion() {
        return Direccion;
    }
}