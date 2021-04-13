/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.CountDownLatch
 */
package c.b.b.a.g;

import c.b.b.a.g.c;
import c.b.b.a.g.e;
import c.b.b.a.g.j;
import c.b.b.a.g.o;
import java.util.concurrent.CountDownLatch;

public final class k
implements Runnable {
    public final /* synthetic */ o a;
    public final /* synthetic */ j b;

    public k(j j10, o o10) {
        this.b = j10;
        this.a = o10;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object;
        Object object2 = object = this.b.b;
        synchronized (object2) {
            if (this.b.c != null) {
                c c10 = this.b.c;
                this.a.b();
                ((e)c10).a.countDown();
            }
            return;
        }
    }
}

