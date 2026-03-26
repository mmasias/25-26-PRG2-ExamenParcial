class Aparcamiento {
    
    private String nombreAparcamiento;
    private Plaza[] plazas;
    private int totalPlazas;
    private int totalFacturado = 0;
    
    public Aparcamiento(int numeroPlazasNormal, int numeroPlazasElectrico, int numeroPlazasMoto, String nombreAparcamiento){
        this.nombreAparcamiento = nombreAparcamiento;
        this.totalPlazas = numeroPlazasNormal + numeroPlazasElectrico + numeroPlazasMoto;
        this.plazas = new Plaza[this.totalPlazas];


        int i = 0;
        for (int j = 0; j < numeroPlazasNormal; j++){
            plazas[i++] = new Plaza(1, false);
        }
        for (int j = 0; j < numeroPlazasElectrico; j++) {
            plazas[i++] = new Plaza(2, false);
        }
        for (int j = 0; j < numeroPlazasMoto; j++) {
            plazas[i++] = new Plaza(3, false);
        }
    }

    public int cantidadPlazasLibres(){
        int plazasLibres = 0;
        for (int i = 0; i < this.plazas.length; i++){
            if(!plazas[i].estaOcupada()){
                plazasLibres++;
            }
        }
        return plazasLibres;
    }

    public void vehiculoLLego(Vehiculo vehiculo) {
    for (int i = 0; i < this.plazas.length; i++) {
        Plaza plazaActual = this.plazas[i];
        
        if (plazaActual.tipoDePlaza() == vehiculo.tipoDelVehiculo() && !plazaActual.estaOcupada()) {
            plazaActual.ocuparPlaza(vehiculo.matricula());
            System.out.println("Vehículo " + vehiculo.matricula() + " aparcado en plaza " + i);
            return;
        }
    }
    System.out.println("No hay plazas libres para este tipo de vehículo.");
}

    public void vehiculoSeFue(Vehiculo vehiculo, int horaLlegada, int horaSalida){
        for (int i = 0; i < this.plazas.length; i++){
            if (this.plazas[i].estaOcupada() && vehiculo.matricula().equals(this.plazas[i].quienOcupaPlaza())){
                Ticket ticket = new Ticket(horaLlegada, horaSalida, this.plazas[i], vehiculo);
                ticket.mostrarTicket();

                this.totalFacturado += ticket.precioTotalEstancia();

                this.plazas[i].liberarPlaza();
                vehiculo.eliminarVehiculo();

                break;
            }
        }
    }

    public void mostrarDatos(){
        System.out.println("Está usted en el Aparcamiento " + this.nombreAparcamiento);
        System.out.println("Disponemos de " + this.totalPlazas + " plazas en nuestro aparcamiento");
        System.out.println("Actualmente hay " + this.cantidadPlazasLibres() + " plazas libres");   
    }

    public int dineroFacturado(){
        return this.totalFacturado;
    }
}