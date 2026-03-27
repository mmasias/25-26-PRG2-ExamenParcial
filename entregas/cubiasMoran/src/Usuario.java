class Usuario {
    private String nombre;
    private String dni;
    private String direccion;

    public Usuario(String nombre, String dni, String direccion){
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
    }

    public Usuario(String nombre, String dni){
        this(nombre, dni, "No especificada");
    }

    public void mostrar(){
        System.out.println("Nombre del usuario: " + nombre + " dni: " + dni + " direccion: " + direccion);
    }

    public void actualizarNombre(String nombre){
        this.nombre = nombre;
    }

    public void actualizarDni(String dni){
        this.dni = dni;
    }

    public void actualizarDireccion(String direccion){
        this.direccion = direccion;
    }
}