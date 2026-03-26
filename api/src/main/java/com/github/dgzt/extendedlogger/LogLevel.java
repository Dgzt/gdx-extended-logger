package com.github.dgzt.extendedlogger;

public enum LogLevel {
    NONE(0),
    ERROR(1),
    INFO(2),
    DEBUG(3),
    TRACE(4);

    public final int value;

    LogLevel(final int value) {
        this.value = value;
    }
}
