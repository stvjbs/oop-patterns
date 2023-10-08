package complexCalculator;

import complexCalculator.view.ViewCalculator;

import static complexCalculator.repository.LogCreator.createLogFile;

public class Main {
    public static void main(String[] args) {
        createLogFile();
        System.out.println("Hello. You accessed to <Calculator for complex numbers> v2.0");
        System.out.println("We can represent any complex number as \n (a+bi) ");
        System.out.println("At least 2 numbers are required for calculations, so...");
        System.out.println("============== \n");
        ViewCalculator viewCalculator = new ViewCalculator();
        viewCalculator.run();
    }
}