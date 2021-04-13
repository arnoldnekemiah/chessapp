/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.g.a
 *  c.b.b.a.g.l
 *  c.b.b.a.g.o
 *  java.lang.Object
 *  java.util.concurrent.Executor
 *  javax.annotation.concurrent.GuardedBy
 */
package c.b.b.a.g;

import c.b.b.a.g.a;
import c.b.b.a.g.l;
import c.b.b.a.g.o;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class g<TResult>
implements l<TResult> {
    public final Executor a;
    public final Object b = new Object();
    @GuardedBy(value="mLock")
    public a c;

    public g(Executor executor, a a8) {
        this.a = executor;
        this.c = a8;
    }

    public final void a(o o10) {
        if (o10 != null) {
            return;
        }
        throw null;
    }
}

