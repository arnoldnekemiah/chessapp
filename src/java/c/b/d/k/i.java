/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.concurrent.TimeUnit
 *  java.util.regex.Pattern
 */
package c.b.d.k;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class i {
    public static final long a = TimeUnit.HOURS.toSeconds(1L);
    public static final Pattern b = Pattern.compile((String)"\\AA[\\w-]{38}\\z");

    public static boolean a(String string) {
        return string.contains((CharSequence)":");
    }

    public long a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }
}

