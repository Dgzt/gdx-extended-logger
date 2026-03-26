package com.github.dgzt.extendedlogger;

public class LoggerImpl implements Logger {

    // If the value is null then will use the common LogManager.LOG_LEVEL value.
    // Here you can overwrite the common log level.
    public LogLevel logLevel = null;

    private final LoggerExecutor executor;

    public LoggerImpl(final LoggerExecutor executor) {
        this.executor = executor;
    }

    @Override
    public void info(String message, String... arguments) {
        if (getLogLevel() >= LogLevel.INFO.value) {
            executor.print(LoggerUtil.format(message, arguments));
        }
    }

    @Override
    public void info(String message, Throwable throwable, String... arguments) {
        if (getLogLevel() >= LogLevel.INFO.value) {
            executor.print(LoggerUtil.format(message, arguments), throwable);
        }
    }

    @Override
    public void debug(String message, String... arguments) {
        if (getLogLevel() >= LogLevel.DEBUG.value) {
            executor.print(LoggerUtil.format(message, arguments));
        }
    }

    @Override
    public void debug(String message, Throwable throwable, String... arguments) {
        if (getLogLevel() >= LogLevel.DEBUG.value) {
            executor.print(LoggerUtil.format(message, arguments), throwable);
        }
    }

    @Override
    public void trace(String message, String... arguments) {
        if (getLogLevel() >= LogLevel.TRACE.value) {
            executor.print(LoggerUtil.format(message, arguments));
        }
    }

    @Override
    public void trace(String message, Throwable throwable, String... arguments) {
        if (getLogLevel() >= LogLevel.TRACE.value) {
            executor.print(LoggerUtil.format(message, arguments), throwable);
        }
    }

    @Override
    public void error(String message, String... arguments) {
        if (getLogLevel() >= LogLevel.ERROR.value) {
            executor.error(LoggerUtil.format(message, arguments));
        }
    }

    @Override
    public void error(String message, Throwable throwable, String... arguments) {
        if (getLogLevel() >= LogLevel.ERROR.value) {
            executor.error(LoggerUtil.format(message, arguments), throwable);
        }
    }

    private int getLogLevel() {
        return logLevel != null ? logLevel.value : LogManager.LOG_LEVEL.value;
    }
}
