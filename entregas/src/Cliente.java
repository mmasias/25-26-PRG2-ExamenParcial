class Cliente {

    public static void main(String[] args) {
        Console console = new Console();
        Gimnasio gimnasio = new Gimnasio("FitLife Center");

        Actividades yoga = new Actividades("Yoga", "Elena Ruiz", "Lun/Vie 10:00", 20);
        Actividades spinning = new Actividades("Spinning", "Carlos López", "Mar/Jue 18:00", 15);
        Actividades pilates = new Actividades("Pilates", "Ana Martínez", "Miércoles 12:00", 12);

        gimnasio.agregarActividad(yoga);
        gimnasio.agregarActividad(spinning);
        gimnasio.agregarActividad(pilates);

        Socios juanGarcia = new Socios("12345678A", "Juan García", true);
        Socios mariaPerez = new Socios("11223344B", "María Pérez", true);
        Socios pedroLopez = new Socios("87654321C", "Pedro López", false);

        gimnasio.inscribirSocio(juanGarcia);
        gimnasio.inscribirSocio(mariaPerez);
        gimnasio.inscribirSocio(pedroLopez);

        Reserva mariaSpinning = new Reserva(mariaPerez, spinning, "02/04/2025");
        Reserva juanYoga = new Reserva(juanGarcia, yoga, "01/04/2025");

        gimnasio.hacerReserva(mariaPerez, spinning, "02/04/2025");
        gimnasio.hacerReserva(juanGarcia, yoga, "01/04/2025");

        console.writeln("Ocupación Yoga = " + yoga.getOcupacion());

        gimnasio.cancelarReserva(juanYoga);

        console.writeln("Gimnasio: " + gimnasio.getNombre());
        console.writeln();

        console.writeln("Actividades: ");
        console.writeln(yoga.getNombre() + " - Monitor: " + yoga.getMonitor() + " - " + yoga.getHorario() + " - Aforo: "
                + yoga.getAforoMaximo());
        console.writeln(spinning.getNombre() + " - Monitor: " + spinning.getMonitor() + " - " + spinning.getHorario()
                + " - Aforo: " + spinning.getAforoMaximo());
        console.writeln(pilates.getNombre() + " - Monitor: " + pilates.getMonitor() + " - " + pilates.getHorario()
                + " - Aforo: " + pilates.getAforoMaximo());

        console.writeln();
        console.writeln("Socios: ");
        console.writeln(
                juanGarcia.getNombre() + " - DNI " + juanGarcia.getDNI() + " - Activo: " + juanGarcia.estaActivo());
        console.writeln(
                mariaPerez.getNombre() + " - DNI " + mariaPerez.getDNI() + " - Activo: " + mariaPerez.estaActivo());
        console.writeln(
                pedroLopez.getNombre() + " - DNI " + pedroLopez.getDNI() + " - Activo: " + pedroLopez.estaActivo());
        console.writeln();

        console.writeln("Reservas: ");
        console.writeln(
                juanYoga.getSocio().getNombre() + " reserva " + juanYoga.getActividad().getNombre() + " el "
                        + juanYoga.getFecha());
        console.writeln(
                mariaSpinning.getSocio().getNombre() + " reserva " + mariaSpinning.getActividad().getNombre() + " el "
                        + mariaSpinning.getFecha());

    }

}