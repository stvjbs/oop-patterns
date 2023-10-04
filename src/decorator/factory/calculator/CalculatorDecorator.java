package decorator.factory.calculator;

import decorator.factory.calculator.log.Loggable;

public class CalculatorDecorator implements Calculable {
    Calculable calculator;
    Loggable logger;
    public CalculatorDecorator(Calculable calculator, Loggable logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        logger.log(String.format("Zapros na vichiclenie sum of %d and %d : ", calculator.getResult(), arg));
        Calculable result = calculator.sum(arg);
        logger.log(String.format("Result is : %d  ", result.getResult()));
        return this;
    }

    @Override
    public Calculable multi(int arg) {
        logger.log(String.format("Zapros na vichiclenie multiplication of %d and %d : ", calculator.getResult(), arg));
        Calculable result = calculator.multi(arg);
        logger.log(String.format("Result is : %d  ", result.getResult()));
        return this;
    }

    @Override
    public int getResult() {
        return calculator.getResult();
    }
}
