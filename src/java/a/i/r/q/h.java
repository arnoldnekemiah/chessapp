/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.ArrayDeque
 *  java.util.concurrent.Executor
 */
package a.i.r.q;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class h
implements Executor {
    public final ArrayDeque<a> a;
    public final Executor b;
    public final Object c;
    public volatile Runnable d;

    public h(Executor executor) {
        this.b = executor;
        this.a = new ArrayDeque();
        this.c = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a() {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            Runnable runnable;
            this.d = runnable = (Runnable)this.a.poll();
            if (runnable != null) {
                this.b.execute(this.d);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void execute(Runnable runnable) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            this.a.add((Object)new a(this, runnable));
            if (this.d == null) {
                this.a();
            }
            return;
        }
    }

    public static class a
    implements Runnable {
        public final h a;
        public final Runnable b;

        public a(h h2, Runnable runnable) {
            this.a = h2;
            this.b = runnable;
        }

        public void run() {
            try {
                this.b.run();
                return;
            }
            finally {
                this.a.a();
            }
        }
    }

}

