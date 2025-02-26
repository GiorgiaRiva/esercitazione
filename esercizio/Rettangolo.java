public class Persona {
    private Double base;
    private Double altezza;

    public Persona(Double base, Double Cognome) {
        this.base = base;
        this.altezza = altezza;
    }


    @Override
    public String toString() {
        return base + ' ' + altezza;
    }
}