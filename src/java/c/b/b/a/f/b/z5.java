/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicReference
 */
package c.b.b.a.f.b;

import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.d;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j6;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.u2;
import c.b.b.a.f.b.z2;
import java.util.concurrent.atomic.AtomicReference;

public final class z5
implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ j6 b;

    public z5(j6 j62, AtomicReference atomicReference) {
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
            Throwable throwable2;
            block6 : {
                try {
                    AtomicReference atomicReference3 = this.a;
                    e e10 = this.b.a.g;
                    String string = this.b.a.f().l();
                    t2<String> t22 = u2.L;
                    if (e10 == null) break block6;
                    String string2 = string == null ? null : e10.c.a(string, t22.a);
                    atomicReference3.set((Object)t22.a(string2));
                }
                catch (Throwable throwable2) {}
                this.a.notify();
                return;
            }
            throw null;
            this.a.notify();
            throw throwable2;
        }
    }
}

