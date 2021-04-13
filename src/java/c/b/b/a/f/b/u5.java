/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicReference
 */
package c.b.b.a.f.b;

import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j6;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.u2;
import c.b.b.a.f.b.z2;
import java.util.concurrent.atomic.AtomicReference;

public final class u5
implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ j6 b;

    public u5(j6 j62, AtomicReference atomicReference) {
        this.b = j62;
        this.a = atomicReference;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = atomicReference = this.a;
        synchronized (atomicReference2) {
            try {
                this.a.set((Object)this.b.a.g.c(this.b.a.f().l(), u2.K));
                return;
            }
            finally {
                this.a.notify();
            }
        }
    }
}

