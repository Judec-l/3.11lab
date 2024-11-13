public class Main {
    public static double eToThe(double x, double EPSILON) {
        double sum = 1.0;
        double term = 1.0;
        int n = 1;

        while (Math.abs(term) >= EPSILON) {
            term *= x / n;
            sum += term;
            n++;
        }
        return sum;
    }

    public static void main(String[] args) {
        double[] xValues = {0, 1, -1, 2, 5};
        double EPSILON = 1e-10;
        for (double x : xValues) {
            System.out.println("e^" + x + " with EPSILON = " + EPSILON + " is: " + eToThe(x, EPSILON));
        }
    }
}