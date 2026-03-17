package com.github.dgzt.extendedlogger;

import com.badlogic.gdx.ApplicationLogger;

public interface ExtendedApplicationLogger extends ApplicationLogger {

    /**
     * Logs a trace message with a tag.
     *
     * @param tag The tag.
     * @param message The message.
     */
    void trace(String tag, String message);

    /**
     * Logs a trace message and exception with a tag.
     *
     * @param tag The tag.
     * @param message The message.
     * @param exception The exception.
     */
    void trace(String tag, String message, Throwable exception);
}
