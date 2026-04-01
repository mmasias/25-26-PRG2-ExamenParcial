class Aparcamiento{
    private Plaza[] listadoDePlazas;
    private String[] estadoDePlazas;

    public Aparcamiento(int numeroDePlazas){
        this.listadoDePlazas = new Plaza[numeroDePlazas];
        this.estadoDePlazas = new String[numeroDePlazas];
    };

    public Aparcamiento(){
        this.listadoDePlazas = new Plaza[10];
        this.estadoDePlazas = new String[10];
    };

    public void agregarPlaza(int numeroDePlaza, Plaza plaza){
        if(numeroDePlaza >= 0 && numeroDePlaza < this.listadoDePlazas.length) {
            this.listadoDePlazas[numeroDePlaza] = plaza;
            this.estadoDePlazas[numeroDePlaza] = plaza.mostrarEstado();
        }
    }

    public Plaza mostrarPlaza(int numeroDePlaza){
        if(numeroDePlaza >= 0 && numeroDePlaza < this.listadoDePlazas.length) {
            return this.listadoDePlazas[numeroDePlaza];
        }
        return null;
    }

    public int expedirTarifa(int horaDeEntrada, int horaDeSalida, Plaza plaza){
        String tipo = plaza.mostrarTipo();
        int horasAparcado = horaDeSalida - horaDeEntrada;
        
        return switch (tipo) {
            case "Electrica" -> horasAparcado * 3;
            case "Normal"    -> horasAparcado * 2;
            case "Moto"      -> horasAparcado * 1;
            default          -> 0;
        }; 
    }

    public int consultarEspaciosDisponibles(){
        int disponibles = 0;

        for (String estado : this.estadoDePlazas) {
            if (estado != null && estado.equals("Disponible")) {
                disponibles++;
            }
        }

        return disponibles;
    }
    
    public void registrarEntrada(Plaza plaza, int horaDeEntrada){
        
        for (int i = 0; i < this.listadoDePlazas.length; i++) {
            if (this.listadoDePlazas[i] == plaza) {
                this.estadoDePlazas[i] = "Ocupado";
                break;
            }
        }

    }

    public String consultarEstado(Plaza plaza){
        
        for (int i = 0; i < this.listadoDePlazas.length; i++) {
            if (this.listadoDePlazas[i] == plaza) {
                return this.estadoDePlazas[i];
            }
        }
        
        return plaza.mostrarEstado(); 
    }
}