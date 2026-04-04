class Socios {

    private String DNI;
    private String nombreSocio;
    private boolean activo;

    public Socios(String DNI, String nombreSocio, boolean activo) {
        this.DNI = DNI;
        this.nombreSocio = nombreSocio;
        this.activo = activo;
    }

    public String getNombre() {
        return nombreSocio;
    }

    public String getDNI() {
        return DNI;
    }

    public boolean estaActivo() {
        return activo;
    }

    public boolean cambioActividad() {
        if (!activo) {
            return activo = true;
        } else {
            return activo = false;
        }
    }

}