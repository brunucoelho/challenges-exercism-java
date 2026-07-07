package main.java.br.com.easy.ao_LogsLogsLogs;

public enum LogLevel {
    UNKNOWN("0", "XYZ"),
    TRACE("1", "TRC"),
    DEBUG("2", "DBG"),
    INFO("4", "INF"),
    WARNING("5", "WRN"),
    ERROR("6", "ERR"),
    FATAL("42", "FTL");

    public String logLevel;
    public String shortLog;

    LogLevel(String shortLog, String logLevel) {
        this.logLevel = logLevel;
        this.shortLog = shortLog;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public String getShortLog() {
        return shortLog;
    }
}