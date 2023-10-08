package complexCalculator.operations;

import complexCalculator.controller.ComplexNumber;

public interface Operatable {
    public ComplexNumber sum(ComplexNumber cx1, ComplexNumber cx2);
    public ComplexNumber subtract(ComplexNumber cx1, ComplexNumber cx2);
    public ComplexNumber multiple(ComplexNumber cx1, ComplexNumber cx2);
    public ComplexNumber divide(ComplexNumber cx1, ComplexNumber cx2);
}
