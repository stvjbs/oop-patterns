package complexCalculator.operations;

import complexCalculator.complexNumberConstructor.ComplexNumber;

public class Operation implements Operatable {
    double a;
    double b;
    ComplexNumber cxResult;

    @Override
    public ComplexNumber getResult() {
        return cxResult;
    }

    @Override
    public ComplexNumber sum(ComplexNumber cx1, ComplexNumber cx2) {
        a = cx1.getA() + cx2.getA();
        b = cx1.getB() + cx2.getB();
        cxResult = new ComplexNumber(a, b);
        return cxResult;
    }

    @Override
    public ComplexNumber subtract(ComplexNumber cx1, ComplexNumber cx2) {
        a = cx1.getA() - cx2.getA();
        b = cx1.getB() - cx2.getB();
        cxResult = new ComplexNumber(a, b);
        return cxResult;
    }

    @Override
    public ComplexNumber multiple(ComplexNumber cx1, ComplexNumber cx2) {
        a = cx1.getA() * cx2.getA() - cx1.getB() * cx2.getB();
        b = cx1.getA() * cx2.getB() + cx1.getB() * cx2.getA();
        cxResult = new ComplexNumber(a, b);
        return cxResult;
    }

    @Override
    public ComplexNumber divide(ComplexNumber cx1, ComplexNumber cx2) {
        a = (cx1.getA() * cx2.getA() + cx1.getB() * cx2.getB()) / (cx2.getA() * cx2.getA() + cx2.getB() * cx2.getB());
        b = (cx2.getA() * cx1.getB() - cx2.getB() * cx1.getA()) / (cx2.getA() * cx2.getA() + cx2.getB() * cx2.getB());
        cxResult = new ComplexNumber(a, b);
        return cxResult;
    }

}
