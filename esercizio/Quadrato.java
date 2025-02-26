class Quadrato extends Rettangolo {
    public Quadrato(double lato) {
        super(lato, lato);
    }
    @Override
    public String toString() {
        return "Quadrato lato=" + getBase() + ", area=" + area() + ", perimetro=" + perimetro();
    }
}

