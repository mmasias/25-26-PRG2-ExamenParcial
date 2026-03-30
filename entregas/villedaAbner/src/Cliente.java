 class Cliente {
    public static void main(String[] args) {
        
        Console consola = new Console();

        consola.writeln("Biblioteca: Biblioteca Municipal\n");

        Libro quijote = new Libro("Don Quijote", "Cervantes", "B001");
        Libro cienAnios = new Libro("Cien años de soledad", "García Márquez", "B002");

        consola.writeln("Libros:");
        consola.writeln("  " + quijote.toString());
        consola.writeln("  " + cienAnios.toString() + "");

        Usuario ana = new Usuario("12345678A", "Ana García", "Direccion no registrada");
        Usuario juan = new Usuario("87654321B", "Juan Pérez", "Direccion no registrada");

        consola.writeln("Usuarios:");
        consola.writeln("  " + ana.toString());
        consola.writeln("  " + juan.toString() + "  ");
    }
}