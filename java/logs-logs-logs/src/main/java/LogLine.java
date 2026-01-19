public class LogLine {

    private final String levelToken;
    private final String message;

    public LogLine(String logLine) {
        String[] splitLogLine = logLine.split("]: ");
        this.levelToken = splitLogLine[0].substring(1);
        this.message = splitLogLine[1];
    }

    public LogLevel getLogLevel() {
        return switch (levelToken) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        return getLogLevel().getCode() + ":" + message;
    }
}
