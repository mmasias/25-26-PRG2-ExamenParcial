class Aparcamiento {
    
    private String nombreAparcamiento;
    private Plaza[] plazas;
    private int totalPlazas;
    
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

    public void vehiculoLLego(Vehiculo vehiculo){
        for (int i = 0; i < this.plazas.length; i++){
            Plaza plazaActual = this.plazas[i];
            plazaActual.ocuparPlaza(vehiculo.matricula());
            System.out.println("Vehículo aparcado");
        }
    }

    public void vehiculoSeFue(){}

    public void mostrarDatos(){}

    public int dineroFacturado(){}

}
