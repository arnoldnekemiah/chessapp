/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package c.b.d.f.a;

import java.util.concurrent.Executor;

public final class d
implements Executor {
    public static final Executor a = new d();

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}

