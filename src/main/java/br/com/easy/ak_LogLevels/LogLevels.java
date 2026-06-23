package main.java.br.com.easy.ak_LogLevels;

public class LogLevels {
    
    public static String message(String logLine) {
        String logLineMessage = logLine.substring(logLine.indexOf(" "), logLine.length()).trim();
        return logLineMessage;
    }

    public static String logLevel(String logLine) {
        String logLineLevel = logLine.substring(logLine.indexOf("[")+1, logLine.indexOf("]")).toLowerCase();
        return logLineLevel;
    }

    public static String reformat(String logLine) {
        String logLineMessage = message(logLine);
        String logLineLevel = logLevel(logLine);
        return logLineMessage + " (" + logLineLevel + ")";
    }
}

