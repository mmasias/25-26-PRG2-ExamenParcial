class Plaza {

    private int tipoPlaza;
    private boolean ocupada;
    private String matriculaVehiculo;
    private int precioPorHora;

    private int precioNormal = 3;
    private int precioElectrico = 5;
    private int precioMoto = 2;

    public Plaza(int tipoPlaza, boolean ocupada) {
        assert tipoPlaza == 1 || tipoPlaza == 2 || tipoPlaza == 3 : "No es un tipo de plaza válido";
        this.tipoPlaza = tipoPlaza;
        this.ocupada = ocupada;
    }

    public boolean estaOcupada() {
        return this.ocupada;
    }

    public int precioPlaza() {
        switch (this.tipoPlaza) {
            case 1:
                precioPorHora = precioNormal;
                break;
            case 2:
                precioPorHora = precioElectrico;
                break;
            case 3:
                precioPorHora = precioMoto;
                break;
        }
        return precioPorHora;
    }

    public String quienOcupaPlaza() {
        return this.matriculaVehiculo;
    }

    public void ocuparPlaza(String matricula) {
        this.ocupada = true;
        this.matriculaVehiculo = matricula;
    }

    public void liberarPlaza() {
        this.ocupada = false;
        this.matriculaVehiculo = null;
    }

    public int tipoDePlaza() {
        return this.tipoPlaza;
    }

    public void mostrarDatos() {
        System.out.println("Esta plaza es de tipo: ");
        switch (this.tipoPlaza) {
            case 1:
                System.out.print("normal");
                break;
            case 2:
                System.out.print("eléctrico");
                break;
            case 3:
                System.out.print("moto");
                break;
        }
    }
}