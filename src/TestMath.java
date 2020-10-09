public class TestMath {
    public static void main(String[] args) {
        int x = 7;
        double r = 5.5;
        int y = 20;
        Math math = new Math();

        System.out.printf("Metoda isEven. Czy liczba %d jest parzysta? Odpowiedź: %b \n", x, math.isEven(x));
        System.out.printf("Metoda isOdd. Czy liczba %d jest nieparzysta? Odpowiedź: %b \n", x, math.isOdd(x));
        System.out.printf("Metoda circleField. Pole koła o promieniu %.2f wynosi: %.4f \n", r, math.circleField(r));
        System.out.printf("Metoda power. Liczba %d do potęgi 2 wynosi: %d \n", y, math.power(y));

    }
}
