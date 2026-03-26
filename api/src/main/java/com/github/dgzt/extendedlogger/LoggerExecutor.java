package com.github.dgzt.extendedlogger;

public interface LoggerExecutor {

    void print(String message);

    void print(String tag, String message);

    void print(String message, Throwable throwable);

    void print(String tag, String message, Throwable throwable);

    void error(String message);

    void error(String tag, String message);

    void error(String message, Throwable throwable);

    void error(String tag, String message, Throwable throwable);
}
