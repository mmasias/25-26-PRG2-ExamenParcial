public class Movimiento {
    private String TipoCuenta;
    private double Cantidad;
    private String IBANOrigen;
    private String IBANDestino;
    
    public Movimiento(String tipo, double cantidad, String ibanOrigen, String ibanDestino) {
        this.TipoCuenta = tipo;
        this.Cantidad = cantidad;
        this.IBANOrigen = ibanOrigen;
        this.IBANDestino = ibanDestino;
        
    }

    public String getTipoCuenta() {
        return TipoCuenta;
    }

    public double getCantidad() {
        return Cantidad;
    }
}