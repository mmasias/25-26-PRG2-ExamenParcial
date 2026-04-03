package Parte1;

public class Banco {
    private String Nombre;
    private List<Cliente> clientes;
    private List<Cuenta> cuentas;

    public Banco(String Nombre);

    public void agregarCliente(Cliente cliente);
    public void abrirCuenta(Cuenta cuenta);
    public void asignarCuentaCliente(Cuenta cuenta, Cliente cliente);

    public List<Cliente> getClientes();
    public List<Cuenta> getCuentas();
}
