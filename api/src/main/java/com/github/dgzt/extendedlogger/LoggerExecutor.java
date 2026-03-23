package com.github.dgzt.extendedlogger;

public interface LoggerExecutor {

    void print(String message);

    void print(String tag, String message);

    void print(String message, Throwable throwable);

    void print(String tag, String message, Throwable throwable);
}
