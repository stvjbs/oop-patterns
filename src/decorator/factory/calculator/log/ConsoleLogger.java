package decorator.factory.calculator.log;

import com.ibm.jvm.Log;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ConsoleLogger implements Loggable {
    @Override
    public void log(String message) {
        System.err.printf("%n%s : %s%n", LocalDateTime.now(),message);
    }
}
