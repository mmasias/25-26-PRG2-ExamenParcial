public class Prestamo {
    
    private final Libro libro;
    private final Usuario usuario;
    private final Fecha fechaPrestamo;
    private final Fecha fechaDevolucion; 

    public Prestamo(Libro libro, Usuario usuario, Fecha fechaPrestamo, Fecha fechaDevolucion) {
        assert libro != null : "Error: El libro no puede ser nulo";
        assert usuario != null : "Error: El usuario no puede ser nulo";
        assert fechaPrestamo != null : "Error: La fecha de prestamo no puede ser nula";
        
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion; 
    }

    public boolean haDevuelto() {
        return this.fechaDevolucion != null;
    }

    public String toString() {
        String datosDelPrestamo = this.usuario.toString() + " toma " + this.libro.toString() + " el " + this.fechaPrestamo.toString();
        
        if (this.haDevuelto()) {
            return datosDelPrestamo + ", devuelve el " + this.fechaDevolucion.toString();
        } else {
            return datosDelPrestamo + ", sin devolver";
        }
    }
}
