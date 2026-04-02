public class Main {
    public static void main(String[] args) {

        // Crear banco
        Banco banco = new Banco("Banco Central");

        // Crear clientes
        Cliente PrimerCliente = new Cliente("Ana Garcia", "12345678A", "Madrid");
        Cliente SegundoCliente = new Cliente("Juan Perez", "87654321B", "Barcelona");

        banco.agregarCliente(PrimerCliente );
        banco.agregarCliente(SegundoCliente );

        }
    }
