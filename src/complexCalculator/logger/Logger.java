package complexCalculator.logger;
import complexCalculator.decorator.CalculatorDec;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Logger implements Logable {

    String fileName;
    public Logger(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void write(String message) {
        List<String> lines = new ArrayList<>();
        lines.add(message);
        saveAll(lines);
    }

    @Override
    public void saveAll(List<String> data) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            for (String line : data) {
                // запись всей строки
                writer.write(line);
                // запись по символам
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
