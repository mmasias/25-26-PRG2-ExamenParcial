class HistorialPrestamo {
    private Prestamo[] prestamos;

    public HistorialPrestamo(Prestamo[] prestamos) {
        this.prestamos = prestamos;
    }

    public void agregarPrestamo(Prestamo nuevoPrestamo) {
        Prestamo[] nuevoArreglo = new Prestamo[this.prestamos.length + 1];
        
        for (int i = 0; i < this.prestamos.length; i++) {
            nuevoArreglo[i] = this.prestamos[i];
        }
        
        nuevoArreglo[nuevoArreglo.length - 1] = nuevoPrestamo;
        this.prestamos = nuevoArreglo;
    }

    public void mostrarHistorial() {
        for (Prestamo prestamo : prestamos) {
            prestamo.mostrar();
        }
    }

}