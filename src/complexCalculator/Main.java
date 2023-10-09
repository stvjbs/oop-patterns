package complexCalculator;

import complexCalculator.decorator.CalculatorDec;
import complexCalculator.operations.Operatable;
import complexCalculator.view.ViewCalculator;

import static complexCalculator.logger.DBConnector.LOG_PATH;
import static complexCalculator.logger.DBConnector.createDB;


public class Main {
    public static void main(String[] args) {
        createDB();
        Operatable calculator = new CalculatorDec(LOG_PATH);
        System.out.println("Hello. You accessed to <Calculator for complex numbers> v2.0");
        System.out.println("We can represent any complex number as \n (a+bi) ");
        System.out.println("At least 2 numbers are required for calculations, so...");
        System.out.println("============== \n");

        ViewCalculator viewCalculator = new ViewCalculator(calculator);
        viewCalculator.run();
    }
}
