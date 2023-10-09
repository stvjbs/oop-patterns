package complexCalculator.decorator;

import complexCalculator.complexNumberConstructor.ComplexNumber;
import complexCalculator.decorator.logger.Logable;
import complexCalculator.operations.Operatable;
import complexCalculator.operations.Operation;

import java.time.LocalDateTime;

public class CalculatorDec implements Operatable {

    Logable log;

    public CalculatorDec(Logable log) {
        this.log = log;
    }


    Operatable operation = new Operation();

    @Override
    public ComplexNumber sum(ComplexNumber cx1, ComplexNumber cx2) {
        String message = " " + cx1 + "+" + cx2 + "=" + operation.sum(cx1, cx2) + " ---" + LocalDateTime.now();
        log.write(message);
        return operation.sum(cx1, cx2);
    }

    @Override
    public ComplexNumber subtract(ComplexNumber cx1, ComplexNumber cx2) {
        String message = " " + cx1 + "-" + cx2 + "=" + operation.sum(cx1, cx2) + " ---" + LocalDateTime.now();
        log.write(message);
        return operation.subtract(cx1, cx2);
    }

    @Override
    public ComplexNumber multiple(ComplexNumber cx1, ComplexNumber cx2) {
        String message = " " + cx1 + "*" + cx2 + "=" + operation.sum(cx1, cx2) + " ---" + LocalDateTime.now();
        log.write(message);
        return operation.multiple(cx1, cx2);
    }

    @Override
    public ComplexNumber divide(ComplexNumber cx1, ComplexNumber cx2) {
        String message = " " + cx1 + "/" + cx2 + "=" + operation.sum(cx1, cx2) + " ---" + LocalDateTime.now();
        log.write(message);
        return operation.divide(cx1, cx2);
    }

    @Override
    public ComplexNumber getResult() {
        return operation.getResult();
    }


}
