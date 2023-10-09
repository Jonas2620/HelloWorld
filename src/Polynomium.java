public class Polynomium {
    public static void main(String[] args) {
        ForstegradsPolynomium forstegradsPolynomium = new ForstegradsPolynomium(3, 2);
        AndengradsPolynomium andengradsPolynomium = new AndengradsPolynomium(2, 2, 3);

        double x1 = 4.0;
        double x2 = -1.0;
        System.out.println("Polynomium 1: " + forstegradsPolynomium);
        System.out.println("x = " + x1 + ", værdi: " + forstegradsPolynomium.beregnVaerdi(x1));

        System.out.println("Polynomium 2: " + andengradsPolynomium);
        System.out.println("x = " + x2 + ", værdi: " + andengradsPolynomium.beregnVaerdi(x2));
    }

    public Polynomium() {
    }

    public String toString() {
        return "Polynomium";
    }
}

class ForstegradsPolynomium extends Polynomium {
    private final double a;
    private final double b;

    public ForstegradsPolynomium(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double beregnVaerdi(double x) {
        return a * x + b;
    }

    public String toString() {
        return "ForstegradsPolynomium: f(x) = " + a + "x + " + b;
    }
}

class AndengradsPolynomium extends Polynomium {
    private final double a;
    private final double b;
    private final double c;

    public AndengradsPolynomium(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double beregnVaerdi(double x) {
        return a * x * x + b * x + c;
    }

    public String toString() {
        return "AndengradsPolynomium: f(x) = " + a + "x^2 + " + b + "x + " + c;
    }
}