import java.util.Scanner;

class Equipos {
    String nombre;
    String color;
    int numeroJugadores;
    int puntos;

    public Equipos(String n, String c, int j) {
        nombre = n;
        color = c;
        numeroJugadores = j;
        puntos = 0;
    }

    public void sumarPuntos(int p) {
        puntos += p;
    }
}

class Partidos {
    Scanner programarLiga = new Scanner(System.in);
    int partidosPendientes = 0;

    public void mostrarPendientes(int jornada) {
        for (int i = jornada; i < 6; i++) {
            System.out.println("Jornada " + i + " pendiente.");
        }
    }
}

class Resultados {
    int resultadosPrevios = 0;
    int randomizarResultados = 0;
    int sumarPuntos = 0;

    public void mostrarResultadosPrevios(int jornada) {
        if (jornada == 0) {
            System.out.println("No hay resultados previos.");
            return;
        }
        for (int i = 0; i < jornada; i++) {
            System.out.println("Jornada " + i + ": " + resultadoSimulado(i));
        }
    }

    public String resultadoSimulado(int j) {
        if (j == 0) return "Los Cracks 1 - 0 ByteFC";
        if (j == 1) return "Compiladores 2 - 2 Pachangueros";
        if (j == 2) return "Los Cracks 3 - 1 Compiladores";
        if (j == 3) return "ByteFC 0 - 1 Pachangueros";
        if (j == 4) return "Los Cracks 2 - 2 Pachangueros";
        if (j == 5) return "Compiladores 1 - 0 ByteFC";
        return "";
    }

    public void simularResultados() {
        System.out.println("Resultados simulados.");
    }

    public void asignarPuntos(Equipos a, Equipos b, Equipos c, Equipos d, int jornada) {
        if (jornada == 0) a.sumarPuntos(3);
        else if (jornada == 1) { c.sumarPuntos(1); d.sumarPuntos(1); }
        else if (jornada == 2) a.sumarPuntos(3);
        else if (jornada == 3) d.sumarPuntos(3);
        else if (jornada == 4) { a.sumarPuntos(1); d.sumarPuntos(1); }
        else if (jornada == 5) c.sumarPuntos(3);
    }
}

class Jornada {
    int jornadaActual = 0;
    int avanzarJornada = 0;

    public int mostrarJornada(int j) {
        return j;
    }

    public int siguienteJornada(int j) {
        return j + 1;
    }
}

public class examenParcialCarlosRodríguezPRG2 {

    Equipos e1 = new Equipos("Los Cracks", "Rojo", 11);
    Equipos e2 = new Equipos("ByteFC", "Azul", 11);
    Equipos e3 = new Equipos("Compiladores", "Verde", 11);
    Equipos e4 = new Equipos("Pachangueros", "Amarillo", 11);

    Partidos partidos = new Partidos();
    Resultados resultados = new Resultados();
    Jornada jornadaObj = new Jornada();

    int jornada = 0;

    public static void main(String[] args) {
        new examenParcialCarlosRodríguezPRG2().inicio();
    }

    public void inicio() {
        boolean salir = false;

        while (!salir) {
            System.out.println("1. Ver la lista de equipos");
            System.out.println("2. Ver los resultados");
            System.out.println("3. Ver las jornadas pendientes");
            System.out.println("4. Ver la clasificación");
            System.out.println("5. Avanzar jornada");
            System.out.println("0. Salir");
            System.out.println();
            System.out.println("Jornada actual: " + jornadaObj.mostrarJornada(jornada));
            System.out.print("Opción: ");

            String op = partidos.programarLiga.nextLine();

            if (op.equals("1")) listaEquipos();
            else if (op.equals("2")) verResultados();
            else if (op.equals("3")) jornadasPendientes();
            else if (op.equals("4")) verClasificacion();
            else if (op.equals("5")) avanzarJornada();
            else if (op.equals("0")) salir = true;

            System.out.println();
        }
    }

    public void listaEquipos() {
        System.out.println(e1.nombre + " - " + e1.puntos + " pts");
        System.out.println(e2.nombre + " - " + e2.puntos + " pts");
        System.out.println(e3.nombre + " - " + e3.puntos + " pts");
        System.out.println(e4.nombre + " - " + e4.puntos + " pts");
    }

    public void verResultados() {
        resultados.mostrarResultadosPrevios(jornada);
    }

    public void jornadasPendientes() {
        partidos.mostrarPendientes(jornada);
    }

    public void verClasificacion() {
        System.out.println(e1.nombre + ": " + e1.puntos);
        System.out.println(e2.nombre + ": " + e2.puntos);
        System.out.println(e3.nombre + ": " + e3.puntos);
        System.out.println(e4.nombre + ": " + e4.puntos);
    }

    public void avanzarJornada() {
        resultados.simularResultados();
        resultados.asignarPuntos(e1, e2, e3, e4, jornada);
        jornada = jornadaObj.siguienteJornada(jornada);
    }
}
