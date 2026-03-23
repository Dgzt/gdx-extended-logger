package com.github.dgzt.extendedlogger;

public class LoggerUtil {

    private static final String MARKER = "{}";
    private static final StringBuilder STRING_BUILDER = new StringBuilder();

    public static String format(final String message, String... arguments) {
        int i = 0;
        STRING_BUILDER.append(message);

        while (i < arguments.length && STRING_BUILDER.indexOf(MARKER) >= 0) {
            final int index = STRING_BUILDER.indexOf(MARKER);
            STRING_BUILDER.replace(index, index + MARKER.length(), arguments[i++]);
        }

        final String result = STRING_BUILDER.toString();
        STRING_BUILDER.setLength(0);
        return result;
    }
}
