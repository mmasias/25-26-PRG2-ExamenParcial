class Aparcamiento{
    public Aparcamiento(int numeroDePlazas){};
    public Aparcamiento(){};

    public void agregarPlaza(int numeroDePlaza, Plaza plaza){};
    public Plaza mostrarPlaza(int numeroDePlaza){};
    public int expedirTarifa(int horaDeEntrada, int horaDeSalida, Plaza plaza){};
    public int consultarEspaciosDisponibles(){};
    public void registrarEntrada(Plaza plaza, int horaDeEntrada){};
    public String consultarEstado(Plaza plaza){};
}