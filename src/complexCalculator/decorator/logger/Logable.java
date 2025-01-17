package complexCalculator.decorator.logger;

import java.util.List;

public interface Logable {
    void write(String message);

    void saveAll(List<String> data);

    List<String> readAll();
}
