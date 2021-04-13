/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.g.c
 *  c.b.b.a.g.k
 *  c.b.b.a.g.l
 *  c.b.b.a.g.o
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 *  javax.annotation.concurrent.GuardedBy
 */
package c.b.b.a.g;

import c.b.b.a.g.c;
import c.b.b.a.g.k;
import c.b.b.a.g.l;
import c.b.b.a.g.o;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class j<TResult>
implements l<TResult> {
    public final Executor a;
    public final Object b = new Object();
    @GuardedBy(value="mLock")
    public c<? super TResult> c;

    public j(Executor executor, c<? super TResult> c8) {
        this.a = executor;
        this.c = c8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(o<TResult> o10) {
        Object object;
        if (!o10.d()) {
            return;
        }
        Object object2 = object = this.b;
        synchronized (object2) {
            if (this.c == null) {
                return;
            }
        }
        this.a.execute((Runnable)new k(this, o10));
    }
}

