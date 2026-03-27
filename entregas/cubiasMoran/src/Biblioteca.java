class Biblioteca {
    private String nombre;

    public Biblioteca(String nombre){
        this.nombre = nombre;
    }

    public void mostrar(){
        System.out.println("Biblioteca: " + this.nombre);
    }

    public void actualizarNombre(String nombre){
        this.nombre = nombre;
    }
}
