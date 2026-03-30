public class Libro {

    private final String titulo;
    private final String autor;
    private final String codigoUnico;

    public Libro(String titulo, String autor, String codigoUnico) {
        assert titulo != null && !titulo.isBlank() : "Error: El título no puede estar vacío";
        assert autor != null && !autor.isBlank() : "Error: El autor no puede estar vacío";
        assert codigoUnico != null && !codigoUnico.isBlank() : "Error: El código único no puede estar vacío";

        this.titulo = titulo;
        this.autor = autor;
        this.codigoUnico = codigoUnico;
    }

    public String toString() {
        return " " + this.titulo + " - " + this.autor + " - DNI: " + this.codigoUnico;
    }
}