import java.util.Date;
class Prestamo{
    private Usuario usuario;
    private Libro libro;
    private Date fechaInicio;
    private Date fechaFin;
    private String estado;

    public Prestamo (Usuario usuario, Libro libro, Date fechaInicio, Date fechaFin, String estado){
        this.usuario = usuario;
        this.libro = libro;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }

    public void actualizarUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public void actualizarLibro(Libro libro){
        this.libro = libro;
    }

    public void actualizarFechaInicio(Date fechaInicio){
        this.fechaInicio = fechaInicio;
    }

    public void actualizarFechaFin(Date fechaFin){
        this.fechaFin = fechaFin;
    }

    public void actualizarEstado(String estado){
        this.estado = estado;
    }

    public void mostrar(){
        System.out.println("Prestamo: ");
        System.out.println("Usuario: " + this.usuario);
        System.out.println("Libro: " + this.libro);
        System.out.println("Fecha de inicio: " + this.fechaInicio);
        System.out.println("Fecha de fin: " + this.fechaFin);
        System.out.println("Estado: " + this.estado);
    }

    public int calcularCantidadDiasRetrasado(Date fechaDevolucion){
        int diaDevolucion = fechaDevolucion.getDate();
        int mesDevolucion = fechaDevolucion.getMonth();
        int anioDevolucion = fechaDevolucion.getYear();
        int diaFin = fechaFin.getDate();
        int mesFin = fechaFin.getMonth();
        int anioFin = fechaFin.getYear();
        int totalDiasDevolucion = (anioDevolucion * 360) + (mesDevolucion * 30) + diaDevolucion;
        int totalDiasFin = (anioFin * 360) + (mesFin * 30) + diaFin;

        int retraso = totalDiasDevolucion - totalDiasFin;

        if (retraso > 0) {
            return retraso;
        }
        
        return 0;
    }
}
    