public class Main {
    public static void approximateRoot(double a, double MAXEPSILON) {
        if (a < 0) {
            System.out.println("Negative numbers don't have real square roots.");
            return;
        }

        double x = 1.0;
        double nextGuess;
        double difference = a - x;

        System.out.printf("%-10s %-15s %s%n", "guess", a + "/guess", "EPSILON");
        System.out.println("---------------------------------------");
        do {
            System.out.printf("%-10.4f %-15.4f %.6f%n", x, a / x, difference);
            nextGuess = (x + a / x) / 2;
            difference = Math.abs(nextGuess - x);
            x = nextGuess;
        } while (difference > MAXEPSILON);

        System.out.printf("%-10.4f %-15.4f %.6f%n", x, a / x, 0.0);
        System.out.println("Final approximation of the square root: " + x);
    }

    public static void main(String[] args) {
        double a = 115;
        double MAXEPSILON = 0.0001;
        System.out.println("Approximating the square root of " + a + " with MAXEPSILON " + MAXEPSILON);
        approximateRoot(a, MAXEPSILON);
    }
}