package ponceKevin.src;
import java.time.LocalDateTime;
public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private LocalDateTime fecha;
    private int golesEquipo1;
    private int golesEquipo2;
    private boolean seCompletoELPartido = false;
    public partido(Equipo equipo1, Equipo equipo2,LocalDateTime fecha) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.fecha = fecha;        
    }

    public void aumentarGoles(int numeroEquipo, int cantidDeGoles) {
        
    }

    public void aumentarGoles(int numeroEquipo) {
        
    }

    public boolean pasoLaFecha() {
     
    }

    public boolean estaPendiente() {
        
    }

    public Equipo getGanador() {
        
    }

    public int[] getGolesPorEquipo() {
        
    }

    public int diasFaltantes() {
        
    }

    public int diasFaltantes(LocalDateTime fechaAComparar) {
        
    }

    public String toString() {
        
    }

}