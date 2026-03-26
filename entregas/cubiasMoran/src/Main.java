class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal");
        
        Usuario usuario1 = new Usuario("Cervantes", "B001");
        Usuario usuario2 = new Usuario("García Marquez", "B002");
        Usuario[] usuariosLibro1 = {usuario1};
        Usuario[] usuariosLibro2 = {usuario2};

        Libro libro1 = new Libro(biblioteca, usuariosLibro1,"Don Quijote","Disponible");
        Libro libro2 = new Libro(biblioteca, usuariosLibro2,"Cien Años de Soledad","Disponible");
        
        Usuario usuario3 = new Usuario("Isabel Allende", "B003", "Calle Falsa 123");
        Usuario usuario4 = new Usuario("Mario Vargas Llosa", "B004", "Avenida Siempre Viva 456");
        
        Prestamo prestamo1 = new Prestamo(usuario1, libro1, new Date(), new Date(), "Activo");
        Prestamo prestamo2 = new Prestamo(usuario2, libro2, new Date(), new Date(), "Activo");
        prestamo1.mostrar();
        prestamo2.mostrar();
    }
}