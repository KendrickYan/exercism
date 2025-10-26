// powershell> javac Runner.java; java Runner
// cmd> javac Runner.java & java Runner

public class Runner {
    public static void main(String[] args) {
        String logLine = "[INFO]: Operation completed";

        String[] logLine_arr = logLine.split(":\\s+");
        String log_message = logLine_arr[logLine_arr.length - 1];
        String log_level = logLine_arr[0].toLowerCase();
        log_level = log_level.substring(1, log_level.length() - 1); // removes []
        String reformated_message = log_message + " (" + log_level + ")";

        System.out.println(reformated_message);
    }
}