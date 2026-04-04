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

    public Plato(String nombre, string tipo, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }
    public String getNombre(){
        return nombre;
    }
    public double String getPrecio(){
        return precio;
    }
}
class Reserva {
    private String cliente;
    private Mesa mesa;
    private String fechaHora;
    private int numeroComensales;
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
    }
}