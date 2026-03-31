class Cliente{
    public static void main(String[] args){
        Aparcamiento nuevoAparcamiento = new Aparcamiento(50);
        Aparcamiento aparcamientoVacio = new Aparcamiento();

        Vehiculo nuevoVehiculo = new Vehiculo("1274ABC", "Coche", "Seat");
        Horario horarioPlazaElectrica = new Horario(1, 8);
        Plaza plazaElectrica = new Plaza("Electrica", horarioPlazaElectrica, "Activo");
    }
}