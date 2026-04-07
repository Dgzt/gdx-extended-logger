package com.github.dgzt.extendedlogger;

public interface Logger {

    void info(String message, String... arguments);

    void info(String tag, String message, String... arguments);

    void info(String message, Throwable throwable, String... arguments);

    void info(String tag, String message, Throwable throwable, String... arguments);

    void debug(String message, String... arguments);

    void debug(String tag, String message, String... arguments);

    void debug(String message, Throwable throwable, String... arguments);

    void debug(String tag, String message, Throwable throwable, String... arguments);

    void trace(String message, String... arguments);

    void trace(String tag, String message, String... arguments);

    void trace(String message, Throwable throwable, String... arguments);

    void trace(String tag, String message, Throwable throwable, String... arguments);

    void error(String message, String... arguments);

    void error(String tag, String message, String... arguments);

    void error(String message, Throwable throwable, String... arguments);

    void error(String tag, String message, Throwable throwable, String... arguments);
}
