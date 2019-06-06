public enum Tipo {
    IMPRESO("Impreso"),DIGITAL("Digital"),AMBOS("Ambos");

    private final String tipo;

    Tipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
