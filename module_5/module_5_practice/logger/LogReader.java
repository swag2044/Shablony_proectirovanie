import java.io.*;
import java.util.stream.*;

public class LogReader {

    private final String filePath;

    public LogReader(String filePath) {
        this.filePath = filePath;
    }

    public void readByLevel(LogLevel level) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.lines()
                    .filter(line -> line.contains("[" + level + "]"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
