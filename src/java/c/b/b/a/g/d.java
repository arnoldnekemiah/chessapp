/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Object
 *  java.util.concurrent.Executor
 */
package c.b.b.a.g;

import android.os.Handler;
import android.os.Looper;
import c.b.b.a.g.n;
import java.util.concurrent.Executor;

public final class d {
    public static final Executor a;

    public static {
        new Handler(Looper.getMainLooper());
        a = new n();
    }
}

