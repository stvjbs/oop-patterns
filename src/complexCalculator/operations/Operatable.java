package complexCalculator.operations;

import complexCalculator.complexNumberConstructor.ComplexNumber;

public interface Operatable {
    ComplexNumber sum(ComplexNumber cx1, ComplexNumber cx2);

    ComplexNumber subtract(ComplexNumber cx1, ComplexNumber cx2);

    ComplexNumber multiple(ComplexNumber cx1, ComplexNumber cx2);

    ComplexNumber divide(ComplexNumber cx1, ComplexNumber cx2);

    ComplexNumber getResult();
}
