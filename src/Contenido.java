public enum Contenido {
    GENERAL("General"),ESPECIFICO("Especifico");

    private final String tipoContenido;

    Contenido(String tipoContenido) {
        this.tipoContenido = tipoContenido;
    }

    public String getTipoContenido() {
        return tipoContenido;
    }
}
