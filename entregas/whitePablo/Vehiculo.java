public class Vehiculo {

    private final String matricula;
    private final String tipo;
    private final String modelo;

    public Vehiculo(String matricula, String tipo, String modelo){
        this.matricula = matricula;
        this.tipo = tipo.toLowerCase();
        this.modelo = modelo;
    }
    
    public String getMatricula() {
        return this.matricula;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String getModelo(){
        return this.modelo;
    }
    
}
