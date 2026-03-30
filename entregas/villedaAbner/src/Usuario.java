public class Usuario {
    private final String dni;
    private final String nombreDeUsuario;
    private final String direccion;

    public Usuario(String DNI, String nombreDeUsuario, String direccion) {
        assert DNI != null && !DNI.isBlank() : "Error: El DNI no puede estar vacio";
        assert nombreDeUsuario != null && !nombreDeUsuario.isBlank()
                : "Error: El nombre de usuario no puede estar vacio";
        assert direccion != null && !   direccion.isBlank() : "Error: la direccion no puede estar vacia";

        this.dni = DNI;
        this.nombreDeUsuario = nombreDeUsuario;
        this.direccion = direccion;

    }

    public String toString() {
        return " " + this.nombreDeUsuario + " - DNI: " + this.dni + "- " + this.direccion;
    }

}
