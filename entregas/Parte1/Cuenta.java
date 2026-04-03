package Parte1;
import java.util.List;


public class Cuenta {
    private String IBAN;
    private double Saldo;
    private String TipoCuenta;
    private Cliente cliente;
    private List<Movimiento> movimientos;

    public Cuenta(String IBAN, double Saldo, String TipoCuenta);

    public String getIBAN();
    public double getSaldo();
    public String getTipoCuenta();
    public Cliente getCliente();

    public void asignarCliente(Cliente cliente);

    public void ingresar(double cantidad);
    public void retirar(double cantidad);
    public void transferir(Cuenta destino, double cantidad);

    public List<Movimiento> getMovimientos();
}
