package main.java.br.com.easy.ao_LogsLogsLogs;

public class LogLine {

    String logLine;
    LogLevel logLevel;
    LogLevel shortLog;
    
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {

        String level = logLine.substring(1, 4);
        switch (level) {
            case "TRC" -> logLevel = LogLevel.TRACE;
            case "DBG" -> logLevel = LogLevel.DEBUG;
            case "INF" -> logLevel = LogLevel.INFO; 
            case "WRN" -> logLevel = LogLevel.WARNING;
            case "ERR" -> logLevel = LogLevel.ERROR;
            case "FTL" -> logLevel = LogLevel.FATAL;
            default -> logLevel = LogLevel.UNKNOWN;
        }
        return logLevel;
    }

    public String getOutputForShortLog() {
        return getLogLevel().shortLog+":"+logLine.substring(7, logLine.length());
    }
}
