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

    public int cantidadPlazasLibres(){}

    public void vehiculoLLego(){}

    public void vehiculoSeFue(){}

    public void mostrarDatos(){}

    public int dineroFacturado(){}

}
