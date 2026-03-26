class Libro{
    private Biblioteca biblioteca;
    private Usuario[] usuarios;
    private String nombre;
    private String estado;
    
    public Libro(Biblioteca biblioteca, Usuario[] usuarios, String nombre, String estado){
        this.biblioteca = biblioteca;
        this.usuarios = usuarios;
        this.nombre = nombre;
        this.estado = estado;
    }

    public void actualizarBiblioteca(Biblioteca biblioteca){
        this.biblioteca = biblioteca;
    }
    
    public void actualizarUsuarios(Usuario[] usuarios){
        this.usuarios = usuarios;
    }

    public void actualizarNombre(String nombre){
        this.nombre = nombre;
    }

    public void actualizarEstado(String estado){
        this.estado = estado;
    }

    public void mostrar(){
        console.writeLine("Libro: " + this.nombre + " estado: " + this.estado);
        console.writeLine("Biblioteca: " + this.biblioteca);
        console.writeLine("Usuarios: ");
        for (Usuario usuario : usuarios) {
            console.writeLine(usuario);
        }
    }
}