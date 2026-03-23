package com.github.dgzt.extendedlogger;

public class LoggerImpl implements Logger {

    private final LoggerExecutor executor;

    public LoggerImpl(final LoggerExecutor executor) {
        this.executor = executor;
    }

    @Override
    public void info(String message, String... arguments) {
        if (LogManager.LOG_LEVEL.getValue() >= LogLevel.INFO.getValue()) {
            executor.print(LoggerUtil.format(message, arguments));
        }
    }

    @Override
    public void info(String message, Throwable throwable, String... arguments) {
        if (LogManager.LOG_LEVEL.getValue() >= LogLevel.INFO.getValue()) {
            executor.print(LoggerUtil.format(message, arguments), throwable);
        }
    }

    @Override
    public void debug(String message, String... arguments) {
        if (LogManager.LOG_LEVEL.getValue() >= LogLevel.DEBUG.getValue()) {
            executor.print(LoggerUtil.format(message, arguments));
        }
    }

    @Override
    public void debug(String message, Throwable throwable, String... arguments) {
        if (LogManager.LOG_LEVEL.getValue() >= LogLevel.DEBUG.getValue()) {
            executor.print(LoggerUtil.format(message, arguments), throwable);
        }
    }

    @Override
    public void trace(String message, String... arguments) {
        if (LogManager.LOG_LEVEL.getValue() >= LogLevel.TRACE.getValue()) {
            executor.print(LoggerUtil.format(message, arguments));
        }
    }

    @Override
    public void trace(String message, Throwable throwable, String... arguments) {
        if (LogManager.LOG_LEVEL.getValue() >= LogLevel.TRACE.getValue()) {
            executor.print(LoggerUtil.format(message, arguments), throwable);
        }
    }

    @Override
    public void error(String message, String... arguments) {
        if (LogManager.LOG_LEVEL.getValue() >= LogLevel.ERROR.getValue()) {
            executor.print(LoggerUtil.format(message, arguments));
        }
    }

    @Override
    public void error(String message, Throwable throwable, String... arguments) {
        if (LogManager.LOG_LEVEL.getValue() >= LogLevel.ERROR.getValue()) {
            executor.print(LoggerUtil.format(message, arguments), throwable);
        }
    }
}
