class Vehiculo {

    private String matricula;
    private String modelo;
    private int tipoVehiculo;

    public Vehiculo(String matricula, int tipoVehiculo, String modelo){
        this.matricula = matricula;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
    }

    public void mostrarDatos(){
        System.out.println("Vehículo: " + this.modelo + "[ " + this.matricula + " ]");
    }

    public void eliminarVehiculo(){
        this.matricula = null;
        this.modelo = null;
        this.tipoVehiculo = 0;
    }
    
}