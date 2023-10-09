package complexCalculator.complexNumberConstructor;

public class ComplexNumber {
    double a;
    double b;

    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public String toString() {
        if (b > 1) {
            return "" + '(' + a +
                    "+" + b + 'i' +
                    ')';
        }
        if (b == 1) {
            return "" + '(' + a +
                    "+" + 'i' +
                    ')';
        }
        if (b == -1) {
            return "" + '(' + a +
                    "-" + 'i' +
                    ')';
        } else return "" + '(' + a + b + 'i' +
                ')';
    }
}
