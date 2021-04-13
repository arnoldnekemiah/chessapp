/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.CountDownLatch
 */
package c.b.b.a.g;

import c.b.b.a.g.b;
import c.b.b.a.g.e;
import c.b.b.a.g.h;
import c.b.b.a.g.o;
import java.util.concurrent.CountDownLatch;

public final class i
implements Runnable {
    public final /* synthetic */ o a;
    public final /* synthetic */ h b;

    public i(h h10, o o10) {
        this.b = h10;
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
                b b10 = this.b.c;
                this.a.a();
                ((e)b10).a.countDown();
            }
            return;
        }
    }
}

