package complexCalculator.logger;

import java.io.File;

public class DBConnector {
    public static final String LOG_PATH = "log.txt";
    public static void createDB() {
        try {
            File db = new File(LOG_PATH);
            if (db.createNewFile()) {
                System.out.println("DB created");
            }
            else {
                System.out.println("DB already exists");
            }
        }
        catch (Exception e) {
            System.err.println("Err");
        }
    }
}
