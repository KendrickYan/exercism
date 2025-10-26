public class LogLevels {

    public static String message(String logLine) {
        String[] logLine_arr = logLine.split(":\\s+");
        String log_message = logLine_arr[logLine_arr.length - 1].stripTrailing();
        return log_message;
    }

    public static String logLevel(String logLine) {
        String[] logLine_arr = logLine.split(":\\s+");
        String log_level = logLine_arr[0].toLowerCase();
        log_level = log_level.substring(1, log_level.length() - 1);
        return log_level;
    }

    public static String reformat(String logLine) {
        String log_message = message(logLine);
        String log_level = logLevel(logLine);
        String reformated_message = log_message + " (" + log_level + ")";
        return reformated_message;
    }
}
