public class Plaza {

    private final String tipo;
    private boolean ocupada;

    public Plaza(String tipo){
        this.tipo = tipo.toLowerCase();
        this.ocupada = false;
    }

    public String getTipo(){
        return this.tipo;
    }

    public boolean estaOcupada(){
        return this.ocupada;
    }

    public void ocupar(){
        this.ocupada = true;
    }

    public void liberar(){
        this.ocupada = false;
    }

}