package vistas.liga;

public class PruebaLiga {
    public static void main(String[] args) {
        Liga liga = new Liga("Liga Universitaria Santander 2024/25");

        Equipo cracks = new Equipo("Los Cracks", "Rojo", 8);
        Equipo byteFC = new Equipo("Byte FC", "Azul", 7);
        Equipo compiladores = new Equipo("Compiladores", "Verde", 9);

        liga.agregarEquipo(cracks);
        liga.agregarEquipo(byteFC);
        liga.agregarEquipo(compiladores);

        Partido p1 = new Partido(cracks, byteFC, new Fecha (1, 3, 2025));
        Partido p2 = new Partido(compiladores, cracks, new Fecha (8, 3, 2025));
        Partido p3 = new Partido(byteFC, compiladores, new Fecha (15, 3, 2025));

        liga.programarPartido(p1);
        liga.programarPartido(p2);
        liga.programarPartido(p3);

        liga.registrarResultado(p1, 3, 1);
        liga.registrarResultado(p2, 2, 2);

        liga.mostrarClasificacion();
        liga.mostrarPartidosPendientes();
    }
}
