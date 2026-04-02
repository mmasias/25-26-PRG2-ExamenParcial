public class Ticket {

    private final Vehiculo vehiculo;
    private final Plaza plaza;
    private final int horaEntrada;

    private static final double TARIFA_NORMAL = 2.0;
    private static final double TARIFA_ELECTRICO = 1.5;
    private static final double TARFIA_MOTO = 1.0;

    public Ticket(Vehiculo vehiculo, Plaza plaza, int horaEntrada){
        this.vehiculo = vehiculo;
        this.plaza = plaza;
        this.horaEntrada = horaEntrada;
    }

    public Vehiculo getVehiculo(){
        return this.vehiculo;
    }

    public Plaza getPlaza(){
        return this.plaza;
    }

    public int getHoraEntrada(){
        return this.horaEntrada;
    }

    public double calcularTarifa(int horaSalida){
        int horas = horaSalida - this.horaEntrada;
        if (horas <= 0) horas = 1;

        double tarifaPorHora;
        switch (this.plaza.getTipo()){
            case "electrico": tarifaPorHora = TARIFA_ELECTRICO; break;
            case "moto": tarifaPorHora = TARFIA_MOTO; break;
            default: tarifaPorHora = TARIFA_NORMAL;
        }

        return horas * tarifaPorHora;
    }
    
}
