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

    @Override
    public void error(String message) {
        System.err.println(message);
    }

    @Override
    public void error(String tag, String message) {
        System.err.println("[" + tag + "] " + message);
    }

    @Override
    public void error(String message, Throwable throwable) {
        System.err.println(message);
        throwable.printStackTrace(System.err);
    }

    @Override
    public void error(String tag, String message, Throwable throwable) {
        System.err.println("[" + tag + "] " + message);
        throwable.printStackTrace(System.err);
    }
}
