import java.util.Date;

class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal");
        biblioteca.mostrar();
        
        Usuario usuario1 = new Usuario("Cervantes", "B001");
        usuario1.mostrar();
        
        Usuario usuario2 = new Usuario("García Marquez", "B002");
        usuario2.mostrar();
        
        Usuario[] usuariosLibro1 = {usuario1};
        Usuario[] usuariosLibro2 = {usuario2};

        Libro libro1 = new Libro(biblioteca, usuariosLibro1,"Don Quijote","Disponible");
        libro1.mostrar();
        
        Libro libro2 = new Libro(biblioteca, usuariosLibro2,"Cien Años de Soledad","Disponible");
        libro2.mostrar();
        
        Usuario usuario3 = new Usuario("Isabel Hinma", "B003", "El Alisal");
        usuario3.mostrar();
        
        Prestamo prestamo1 = new Prestamo(usuario3, libro1, new Date(2024, 6, 1), new Date(2024, 6, 15), "Activo");
        prestamo1.actualizarEstado("Devuelto");
        prestamo1.mostrar();

        HistorialPrestamo historial = new HistorialPrestamo(new Prestamo[]{prestamo1});

        Prestamo prestamo2 = new Prestamo(usuario3, libro2, new Date(2024, 6, 5), new Date(2024, 6, 20), "Activo");
        historial.agregarPrestamo(prestamo2);
        prestamo2.mostrar();

        System.out.println("Días de retraso prestamo 2: " + prestamo2.calcularCantidadDiasRetrasado(new Date(2024, 6, 25)));

        System.out.println("Historial de préstamos: ");
        historial.mostrarHistorial();
    }
}