class Fecha {
    
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        assert dia > 0 && dia <= 31;
        assert mes > 0 && mes <= 12;

        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public Fecha(int dia, int mes) {
        this(dia, mes, 0);
    }

    public Fecha(){}

    public Fecha(Fecha fecha){
        this(fecha.dia, fecha.mes, fecha.año);
    }

    public Fecha clone(){}

    public int dia(){}

    public int mes(){}
    
    public int año(){}

    public boolean equals(Fecha fecha){}

    public String toString(){}

    public void mostrar(){}

}
