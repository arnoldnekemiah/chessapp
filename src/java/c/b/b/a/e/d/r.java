/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ThreadFactory
 */
package c.b.b.a.e.d;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class r
implements ThreadFactory {
    public final ThreadFactory a = Executors.defaultThreadFactory();

    public final Thread newThread(Runnable runnable) {
        Thread thread = this.a.newThread(runnable);
        thread.setName("ScionFrontendApi");
        return thread;
    }
}

