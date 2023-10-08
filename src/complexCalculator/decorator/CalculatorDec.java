package complexCalculator.decorator;

import complexCalculator.controller.ComplexNumber;
import complexCalculator.operations.Operatable;
import java.time.LocalDateTime;

public class CalculatorDec implements Operatable {
    LocalDateTime timestamp;
    @Override
    public ComplexNumber sum(ComplexNumber cx1, ComplexNumber cx2) {
        System.out.printf("%s + %s = %s --- %s",cx1, cx2, sum(cx1,cx2), LocalDateTime.now() );
    }

    @Override
    public ComplexNumber subtract(ComplexNumber cx1, ComplexNumber cx2) {
        return null;
    }

    @Override
    public ComplexNumber multiple(ComplexNumber cx1, ComplexNumber cx2) {
        return null;
    }

    @Override
    public ComplexNumber divide(ComplexNumber cx1, ComplexNumber cx2) {
        return null;
    }
}
