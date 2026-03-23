package com.github.dgzt.extendedlogger;

public class Lwjgl3LoggerExecutor implements LoggerExecutor {


    @Override
    public void print(final String message) {
        System.out.println(message);
    }

    @Override
    public void print(String tag, String message) {
        System.out.println("[" + tag + "] " + message);
    }

    @Override
    public void print(final String message, final Throwable throwable) {
        System.out.println(message);
        throwable.printStackTrace(System.out);
    }

    @Override
    public void print(String tag, String message, Throwable throwable) {
        System.out.println("[" + tag + "] " + message);
        throwable.printStackTrace(System.out);
    }
}
