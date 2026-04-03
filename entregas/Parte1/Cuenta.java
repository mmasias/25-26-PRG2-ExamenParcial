package Parte1;
import java.util.ArrayList;
import java.util.List;



public class Cuenta {
    private String IBAN;
    private double Saldo;
    private String TipoCuenta;
    private Cliente cliente;
    private List<Movimiento> movimientos;

   public Cuenta(String IBAN, double Saldo, String TipoCuenta) {
        this.IBAN = IBAN;
        this.Saldo = Saldo;
        this.TipoCuenta = TipoCuenta;
        this.movimientos = new ArrayList<>();
    }

    public String getIBAN() {
        return IBAN;
    }

    public double getSaldo() {
        return Saldo;
    }

    public String getTipoCuenta() {
        return TipoCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void asignarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void ingresar(double cantidad) {
        Saldo += cantidad;
        movimientos.add(new Movimiento("Ingreso", cantidad, IBAN, null));
    }

    public void retirar(double cantidad) {
        Saldo -= cantidad;
        movimientos.add(new Movimiento("Retirada", cantidad, IBAN, null));
    }

    public void transferir(Cuenta destino, double cantidad) {
        this.Saldo -= cantidad;
        destino.Saldo += cantidad;

        movimientos.add(new Movimiento("Transferencia", cantidad, this.IBAN, destino.IBAN));
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

}
