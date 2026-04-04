import java.util.Scanner;

class Mesa {
    private int numero;
    private int capacidad; 

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }
    public int getNumero(){
        return numero;
    }
    public int getCapacidad(){
        return capacidad;
    }
}
class Plato {
    private String nombre;
    private String tipo;
    private double precio;

    public Plato(String nombre, String tipo, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
}
class Reserva {
    public String cliente;
    public Mesa mesa;
    public String fechaHora;
    public int numeroComensales;
    private Plato[] platos =new Plato[10];
    private int contadorPlatos = 0;
    
    public Reserva(String cliente, Mesa mesa, String fechaHora, int numeroComensales) {
        this.cliente = cliente;
        this.mesa = mesa;
        this.fechaHora = fechaHora;
        this.numeroComensales = numeroComensales;
    }
    public void agregarPlato(Plato plato){
        if (contadorPlatos < platos.length) {
            platos[contadorPlatos] = plato;
            contadorPlatos++;
        } else {
            System.out.println("No se pueden agregar más platos a esta reserva.");
        }
    }
    public double calcularCosteTotal(){
        double total = 0;
        for (int i = 0; i < contadorPlatos; i++) {
            total += platos[i].getPrecio();
        }        return total;
    }
}


public class GestionarRestaurante {
    public static void main(String[] args) {
        Mesa mesa1 = new Mesa(1, 2);
        Mesa mesa2 = new Mesa(2,4);
        Mesa mesa3 = new Mesa(3,6);

        Plato plato1 = new Plato("Ensalada César", "Entrada", 12.0);
        Plato plato2 = new Plato("Filete de ternera", "Principal", 25.0);
        Plato plato3 = new Plato("Paella", "Principal", 22.0);
        Plato plato4 = new Plato("Flan de huevo", "Postre", 6.0);

        Reserva reserva1 = new Reserva("Pedro García", mesa2, "01/04/2025 20:00", 4);
        Reserva reserva2 = new Reserva("María López", mesa1, "02/04/2025 21:00", 2);

        reserva1.agregarPlato(plato3);
        reserva1.agregarPlato(plato4);

        System.out.println("Mesas:\n" +
            "  Mesa 1 - Capacidad: " + mesa1.getCapacidad() + "\n" +
            "  Mesa 2 - Capacidad: " + mesa2.getCapacidad() + "\n" +
            "  Mesa 3 - Capacidad: " + mesa3.getCapacidad() + "\n");

        System.out.println("Menú:\n" +
            "  Entrante: \"" + plato1.getNombre() + "\" - 12 euros\n" +
            "  Principal: \"" + plato2.getNombre() + "\" - 25 euros\n" +
            "  Principal: \"" + plato3.getNombre() + "\" - 22 euros\n" +
            "  Postre: \"" + plato4.getNombre() + "\" - 6 euros\n");

        System.out.println("Reservas:\n" +
            "  \"" + reserva1.cliente + "\" - Mesa " + reserva1.mesa.getNumero() + " - " + reserva1.fechaHora + " - " + reserva1.numeroComensales + " personas\n" +
            "  Coste total de " + reserva1.cliente + ": " + reserva1.calcularCosteTotal() + " euros\n\n" +
            "  \"" + reserva2.cliente + "\" - Mesa " + reserva2.mesa.getNumero() + " - " + reserva2.fechaHora + " - " + reserva2.numeroComensales + " personas");

        System.out.println("\nDetalle de pedido para " + reserva1.cliente + ":");
        System.out.println("  - " + plato3.getNombre());
        System.out.println("  - " + plato4.getNombre());
    }
}