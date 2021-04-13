/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.Executor
 */
package a.i.r.q.l;

import java.util.concurrent.Executor;

public final class b
extends Enum<b>
implements Executor {
    public static final /* enum */ b a;
    public static final /* synthetic */ b[] b;

    public static {
        b b2;
        a = b2 = new b();
        b = new b[]{b2};
    }

    public static b valueOf(String string) {
        return (b)Enum.valueOf(b.class, (String)string);
    }

    public static b[] values() {
        return (b[])b.clone();
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}

