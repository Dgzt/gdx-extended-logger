package com.github.dgzt.extendedlogger;

public class LogManager {

    public static LogLevel LOG_LEVEL = LogLevel.ERROR;

    private static LoggerExecutor loggerExecutor;

    public static void init(final LoggerExecutor loggerExecutor) {
        LogManager.loggerExecutor = loggerExecutor;
    }

    static Logger getLogger(Class<?> clazz) {
        return new LoggerImpl(LogManager.loggerExecutor);
    }
}
