package complexCalculator.view;
import complexCalculator.complexNumberConstructor.ComplexNumber;
import complexCalculator.operations.Operatable;
import java.util.Scanner;

public class ViewCalculator {
    Operatable operation;

    public ViewCalculator(Operatable operation) {
        this.operation = operation;
    }

    private ComplexNumber cx1;
    private ComplexNumber cx2;
    private Scanner input = new Scanner(System.in);
    private int oper;

    public void run() {

        while (oper != 6) {
            System.out.println("\n ============== \n");
            System.out.println("  1 - Summary \n 2 - Subtraction \n 3 - Multiplication \n 4 - Dividing \n 5 - Continue working \n 6- Exit");
            System.out.println("\n ============== \n");
            System.out.println("Input the number of operation, that you want to do");
            oper = input.nextInt();


            switch (oper) {
                case 1:
                    inputingOfNumbers();
                    operation.sum(cx1, cx2);
                    System.out.printf("Result is - %s ",operation.getResult());
                    break;
                case 2:
                    inputingOfNumbers();
                    operation.subtract(cx1, cx2);
                    System.out.printf("Result is - %s ",operation.getResult());
                    break;
                case 3:
                    inputingOfNumbers();
                    operation.multiple(cx1, cx2);
                    System.out.printf("Result is - %s ",operation.getResult());
                    break;
                case 4:
                    inputingOfNumbers();
                    operation.divide(cx1, cx2);
                    System.out.printf("Result is - %s ",operation.getResult());
                    break;
                case 5:
                    break;
            }
        }
    }

    public void inputingOfNumbers() {
        System.out.println("============== \n");
        while (true) {
            System.out.println("Input 'a' of the first number: ");
            input = new Scanner(System.in);
            double a;
            if (input.hasNextDouble())
                a = input.nextDouble();
            else {
                System.out.println("Incorrect input. Please, try again");
                continue;
            }
            System.out.println("Input 'b' of the first number: ");
            double b;
            if (input.hasNextDouble())
                b = input.nextDouble();
            else {
                System.out.println("Incorrect input. Please, try again");
                continue;
            }
            cx1 = new ComplexNumber(a, b);
            System.out.println("Input 'a' of the second number: ");
            if (input.hasNextDouble())
                a = input.nextDouble();
            else {
                System.out.println("Incorrect input. Please, try again");
                continue;
            }
            System.out.println("Input 'b' of the second number: ");
            if (input.hasNextDouble())
                b = input.nextDouble();
            else {
                System.out.println("Incorrect input. Please, try again");
                continue;
            }
            cx2 = new ComplexNumber(a, b);
            System.out.println("============== \n");
            break;
        }

    }
}

