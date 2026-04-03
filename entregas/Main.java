import Parte1.Cuenta;
import Parte1.Banco;
import Parte1.Cliente;
import Parte1.Movimiento;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Banco Central");

        Cliente PrimerCliente = new Cliente("Ana Garcia", "12345678A", "Madrid");
        Cliente SegundoCliente = new Cliente("Juan Perez", "87654321B", "Barcelona");

        banco.agregarCliente(PrimerCliente );
        banco.agregarCliente(SegundoCliente );

        Cuenta PrimeraCuenta = new Cuenta("ES91 1234 5678 9012 3456", 5000, "Nómina");
        Cuenta SegundaCuenta = new Cuenta("ES91 9876 5432 1098 7654", 3000, "Estándar");
        Cuenta TerceraCuenta = new Cuenta("ES91 5555 6666 7777 8888", 10000, "Premium");

        banco.abrirCuenta(PrimeraCuenta);
        banco.abrirCuenta(SegundaCuenta);
        banco.abrirCuenta(TerceraCuenta);

        banco.asignarCuentaCliente(PrimeraCuenta, PrimerCliente);
        banco.asignarCuentaCliente(SegundaCuenta, SegundoCliente);
        banco.asignarCuentaCliente(TerceraCuenta, PrimerCliente);

        
        PrimeraCuenta.ingresar(1000); 
        SegundaCuenta.retirar(200);   
        TerceraCuenta.transferir(PrimeraCuenta, 500); 

        System.out.println("Saldo cuenta1: " + PrimeraCuenta.getSaldo());

        for (Movimiento m : PrimeraCuenta.getMovimientos()) {
            System.out.println(m.getTipoCuenta() + " - " + m.getCantidad());
        }

    }
}
