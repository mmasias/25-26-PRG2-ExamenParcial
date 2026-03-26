class Vehiculo {

    private String matricula;
    private String modelo;
    private int tipoVehiculo;

    public Vehiculo(String matricula, int tipoVehiculo, String modelo) {
        assert tipoVehiculo == 1 || tipoVehiculo == 2 || tipoVehiculo == 3 : "No es un tipo de vehículo válido";

        this.matricula = matricula;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
    }

    public void mostrarDatos() {
        System.out.println("Vehículo: " + this.modelo + "[ " + this.matricula + " ]");
    }

    public void eliminarVehiculo() {
        this.matricula = null;
        this.modelo = null;
        this.tipoVehiculo = 0;
    }

    public String matricula() {
        return this.matricula;
    }

    public int tipoDelVehiculo() {
        return this.tipoVehiculo;
    }
}