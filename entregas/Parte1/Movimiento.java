package Parte1;

public class Movimiento {
    private String TipoCuenta; 
    private double Cantidad;
    private String IBANOrigen;
    private String IBANDestino;
    

    public Movimiento(String TipoCuenta, double Cantidad, String IBANOrigen, String IBANDestino);

    public String getTipoCuenta();
    public double getCantidad();
   
}