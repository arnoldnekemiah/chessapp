/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package c.b.b.a.g;

import java.util.concurrent.Executor;

public final class n
implements Executor {
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}

