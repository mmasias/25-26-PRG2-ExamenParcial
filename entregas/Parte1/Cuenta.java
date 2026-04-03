package Parte1;
import java.util.List;
import java.util.ArrayList;



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

    public void asignarCliente(Cliente cliente);

    public void ingresar(double cantidad);
    public void retirar(double cantidad);
    public void transferir(Cuenta destino, double cantidad);

    public List<Movimiento> getMovimientos();
}
