public class Main1 {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 3);
        System.out.println("Rettangolo - Area: " + rettangolo.area());
        System.out.println("Rettangolo - Perimetro: " + rettangolo.perimetro());

        Quadrato quadrato = new Quadrato(4);
        System.out.println("Quadrato - Area: " + quadrato.area());
        System.out.println("Quadrato - Perimetro: " + quadrato.perimetro());
    }
}
