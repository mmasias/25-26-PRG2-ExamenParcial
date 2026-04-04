package Parte1;
import java.time.LocalDate;

public class Movimiento {
    private String tipo;
    private double cantidad;
    private String ibanOrigen;
    private String ibanDestino;
    private LocalDate fecha;

    public Movimiento(String tipo, double cantidad, String ibanOrigen, String ibanDestino) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.ibanOrigen = ibanOrigen;
        this.ibanDestino = ibanDestino;
        this.fecha = LocalDate.now();
    }

    public String getTipo() {
        return tipo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}