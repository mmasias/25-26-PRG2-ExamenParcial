import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String Nombre;
    private List<Cliente> clientes;
    private List<Cuenta> cuentas;

    public Banco(String nombre) {
        this.Nombre = nombre;
        this.clientes = new ArrayList<>();
        this.cuentas = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void abrirCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public void asignarCuentaCliente(Cuenta cuenta, Cliente cliente) {
        cuenta.asignarCliente(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }
}
