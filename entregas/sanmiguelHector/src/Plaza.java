class Plaza {
    
    private int tipoPlaza;
    private boolean ocupada;
    private String matriculaVehiculo;


    public Plaza (int tipoPlaza, boolean ocupada){
        this.tipoPlaza = tipoPlaza;
        this.ocupada = ocupada;
    }

    public boolean estaOcupada(){
        return this.ocupada;
    }

    public int precioPlaza(){}

    public String quienOcupaPlaza(){}

    public void mostrarDatos(){}

}