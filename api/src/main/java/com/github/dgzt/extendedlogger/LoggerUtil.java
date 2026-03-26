package com.github.dgzt.extendedlogger;

import com.badlogic.gdx.utils.DefaultPool;
import com.badlogic.gdx.utils.Pool;

public class LoggerUtil {

    private static final Pool<StringBuilder> SB_POOL = new DefaultPool<>(StringBuilder::new);

    private static final String MARKER = "{}";

    public static String format(final String message, String... arguments) {
        int i = 0;
        final StringBuilder sb = SB_POOL.obtain();
        sb.setLength(0);
        sb.append(message);

        while (i < arguments.length && sb.indexOf(MARKER) >= 0) {
            final int index = sb.indexOf(MARKER);
            sb.replace(index, index + MARKER.length(), arguments[i++]);
        }

        final String result = sb.toString();
        sb.setLength(0);
        SB_POOL.free(sb);
        return result;
    }
}
