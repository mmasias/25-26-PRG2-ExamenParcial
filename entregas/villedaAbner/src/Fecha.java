public class Fecha {
    private final int dia;
    private final int mes;
    private final int año;

    private int esDiayMes(int mes, int año) {
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else if (mes == 2 && año % 4 == 0) {
            return 29;
        } else if (mes == 2) {
            return 28;
        } else {
            return 31;
        }
    }
    public Fecha(int dia, int mes, int año) {
        assert mes >= 1 && mes <= 12 : "Error, mes debe estar entre 1 y 12";
        assert dia >= 1 && dia <= esDiayMes(mes, año) : "Error, dia tiene que estar entre 1 y el mes correcto";
        assert año > 0 : "Error, año mayor a 0 ";

        this.dia = dia;
        this.mes = mes;
        this.año = año;

    }
    public String toString() {
        return " \"" + this.dia + "/" +this.mes + "/" + this.año + "\"";
    }

}
