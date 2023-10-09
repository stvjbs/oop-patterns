package complexCalculator.logger;
import java.util.List;

public interface Logable {
    void write(String message);

    void saveAll(List<String> data);
}
