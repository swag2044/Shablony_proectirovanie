import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

public class Logger {

    private static volatile Logger instance;
    private static final Object lock = new Object();

    private LogLevel currentLevel;
    private String filePath;
    private long maxFileSize;
    private boolean logToConsole;

    private Logger() {
        loadConfig("logger.properties");
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public synchronized void setLogLevel(LogLevel level) {
        this.currentLevel = level;
    }

    public void log(String message, LogLevel level) {
        if (level.getPriority() < currentLevel.getPriority()) return;

        String formattedMessage = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
                + " [" + level + "] " + message;

        synchronized (lock) {
            try {
                rotateIfNeeded();
                Files.write(Paths.get(filePath),
                        (formattedMessage + System.lineSeparator()).getBytes(),
                        StandardOpenOption.CREATE,
                        StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (logToConsole) {
            System.out.println(formattedMessage);
        }
    }

    private void loadConfig(String configPath) {
        Properties props = new Properties();
        try (FileInputStream fis = new FileInputStream(configPath)) {
            props.load(fis);
            filePath = props.getProperty("log.file");
            currentLevel = LogLevel.valueOf(props.getProperty("log.level"));
            maxFileSize = Long.parseLong(props.getProperty("log.maxsize"));
            logToConsole = Boolean.parseBoolean(props.getProperty("log.console"));
        } catch (Exception e) {
            System.out.println("Config not found, using defaults.");
            filePath = "app.log";
            currentLevel = LogLevel.INFO;
            maxFileSize = 1000000;
            logToConsole = true;
        }
    }

    private void rotateIfNeeded() throws IOException {
        File file = new File(filePath);
        if (file.exists() && file.length() >= maxFileSize) {
            String newName = "app_" + System.currentTimeMillis() + ".log";
            file.renameTo(new File(newName));
        }
    }
}
