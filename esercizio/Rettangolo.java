
class Rettangolo extends Poligono {
    private double base;
    private double altezza;
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    public double getBase() {
        return base;
    }
    public double getAltezza() {
        return altezza;
    }
    @Override
    public double area() {
        return base * altezza;
    }
    @Override
    public double perimetro() {
        return 2 * (base + altezza);
    }
    @Override
    public String toString() {
        return "Rettangolo base=" + base + ", altezza=" + altezza +
               ", area=" + area() + ", perimetro=" + perimetro();
    }
}
