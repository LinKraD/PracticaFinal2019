public enum Ambitos {
    REGIONAL("Regional"),PROVINCIAL("Provincial"),NACIONAL("Nacional"),LOCAL("Local");

    private final String tipo;

    Ambitos(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

}
