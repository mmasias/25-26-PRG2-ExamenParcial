 class Cliente {
    public static void main(String[] args) {
        
        Console consola = new Console();

        consola.writeln("Biblioteca: Biblioteca Municipal\n");

        Libro quijote = new Libro("Don Quijote", "Cervantes", "B001");
        Libro cienAnios = new Libro("Cien años de soledad", "García Márquez", "B002");

        consola.writeln("Libros:");
        consola.writeln("  " + quijote.toString());
        consola.writeln("  " + cienAnios.toString() + "");
    }
}