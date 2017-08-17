package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger loggerInstance = null;
    private String lastLog = "";

    private Logger() {
    }

    public static Logger getInstance() {
        if(loggerInstance == null) {
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }

    /*Was void*/
    public String log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
        return log;
    }

    /*Had no println*/
    public String getLastLog() {
        System.out.println("Last log is [" + lastLog + "]");
        return lastLog;
    }
}