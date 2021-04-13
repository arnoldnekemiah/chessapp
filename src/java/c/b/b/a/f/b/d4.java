/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.Callable
 *  java.util.concurrent.FutureTask
 *  java.util.concurrent.atomic.AtomicLong
 */
package c.b.b.a.f.b;

import a.c.a.a;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

public final class d4<V>
extends FutureTask<V>
implements Comparable<d4<V>> {
    public final long a;
    public final boolean b;
    public final String c;
    public final /* synthetic */ f4 d;

    public d4(f4 f42, Runnable runnable, boolean bl, String string) {
        long l2;
        this.d = f42;
        super(runnable, null);
        a.a(string);
        this.a = l2 = f4.l.getAndIncrement();
        this.c = string;
        this.b = bl;
        if (l2 == Long.MAX_VALUE) {
            f42.a.a().f.a("Tasks index overflow");
        }
    }

    public d4(Callable<V> callable, boolean bl, String string) {
        long l2;
        this.d = callable;
        super((Callable)bl);
        a.a("Task exception on worker thread");
        this.a = l2 = f4.l.getAndIncrement();
        this.c = "Task exception on worker thread";
        this.b = string;
        if (l2 == Long.MAX_VALUE) {
            callable.a.a().f.a("Tasks index overflow");
        }
    }

    public final int compareTo(Object object) {
        d4 d42 = (d4)((Object)object);
        boolean bl = this.b;
        if (bl != d42.b) {
            if (!bl) {
                return 1;
            }
            return -1;
        }
        long l2 = this.a;
        long l10 = d42.a;
        if (l2 < l10) {
            return -1;
        }
        if (l2 > l10) {
            return 1;
        }
        this.d.a.a().g.a("Two tasks share the same index. index", this.a);
        return 0;
    }

    public final void setException(Throwable throwable) {
        this.d.a.a().f.a(this.c, (Object)throwable);
        super.setException(throwable);
    }
}

